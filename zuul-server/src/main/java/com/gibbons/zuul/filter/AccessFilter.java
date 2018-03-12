package com.gibbons.zuul.filter;

import com.alibaba.fastjson.JSON;
import com.gibbons.common.constant.CommonConstants;
import com.gibbons.common.exception.auth.ClientInvalidException;
import com.gibbons.common.exception.auth.UserTokenException;
import com.gibbons.common.util.jwt.IJWTInfo;
import com.gibbons.common.vo.BaseResponse;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.zuul.jwt.UserAuthUtil;
import com.gibbons.zuul.rpc.ClientAuthRpc;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ace on 2017/9/10.
 */
@Component
public class AccessFilter extends ZuulFilter {

    private static final Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Value("${zuul.prefix}")
    private String zuulPrefix;

    @Value("${gate.ignore.startWith}")
    private String startWith;

    @Value("${auth.user.token-header}")
    private String tokenHeader;

    @Value("${auth.client.id}")
    private String clientId;

    @Value("${auth.client.secret}")
    private String clientSecret;

    @Value("${auth.client.token-header}")
    private String clientTokenHeader;

    @Autowired
    private UserAuthUtil userAuthUtil;

    @Autowired
    private ClientAuthRpc clientAuthRpc;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        final String requestUri = request.getRequestURI().substring(zuulPrefix.length());
        // 不进行拦截的地址
        if (isStartWith(requestUri)) {
            return null;
        }

        IJWTInfo user = null;
        try {
            // 验证用户合法性
            user = getJWTUser(request, ctx);
        } catch (Exception e) {
            setFailedRequest(JSON.toJSONString(new UserTokenException(e.getMessage())), 200);
            return null;
        }

        try {
            // 申请客户端密钥头
            BaseResponse resp = clientAuthRpc.getAccessToken(clientId, clientSecret);
            if (resp.getStatus() == 200) {
                if (resp instanceof ObjectRestResponse) {
                    ObjectRestResponse<String> clientToken = (ObjectRestResponse<String>) resp;
                    ctx.addZuulRequestHeader(clientTokenHeader, clientToken.getData());
                } else {
                    throw new ClientInvalidException("Gate client secret is Error");
                }
            }
        } catch (ClientInvalidException ex) {
            ctx.setResponseBody(JSON.toJSONString(new BaseResponse(ex.getStatus(), ex.getMessage())));
        } catch (Exception e) {
            ctx.setResponseBody(JSON.toJSONString(new BaseResponse(CommonConstants.EX_TOKEN_ERROR_CODE, "Token error or Token is Expired！")));
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 返回session中的用户信息
     *
     * @param request
     * @param ctx
     * @return
     */
    private IJWTInfo getJWTUser(HttpServletRequest request, RequestContext ctx) throws Exception {
        String authToken = request.getHeader(tokenHeader);
        if (StringUtils.isBlank(authToken)) {
            authToken = request.getParameter("token");
        }
        ctx.addZuulRequestHeader(tokenHeader, authToken);
        return userAuthUtil.getInfoFromToken(authToken);
    }

    /**
     * 网关抛异常
     *
     * @param body
     * @param code
     */
    private void setFailedRequest(String body, int code) {
        log.debug("Reporting error ({}): {}", code, body);
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setResponseStatusCode(code);
        if (ctx.getResponseBody() == null) {
            ctx.setResponseBody(body);
            ctx.setSendZuulResponse(false);
        }
    }

    /**
     * URI是否以什么打头
     *
     * @param requestUri
     * @return
     */
    private boolean isStartWith(String requestUri) {
        boolean flag = false;
        for (String s : startWith.split(",")) {
            if (requestUri.startsWith(s)) {
                return true;
            }
        }
        return flag;
    }
}
