package com.gibbons.member.interceptor;

import com.gibbons.common.exception.auth.ClientForbiddenException;
import com.gibbons.common.util.jwt.IJWTInfo;
import com.gibbons.common.vo.BaseResponse;
import com.gibbons.common.vo.ObjectRestResponse;
import com.gibbons.member.jwt.ClientTokenUtil;
import com.gibbons.member.rpc.ClientAuthRpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ace on 2017/9/12.
 */
@Configuration
public class ServiceAuthRestInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(ServiceAuthRestInterceptor.class);

    @Value("${client.token-header}")
    private String tokenHeader;

    @Value("${client.id}")
    private String clientId;

    @Value("${client.secret}")
    private String clientSecret;

    @Autowired
    private ClientTokenUtil clientTokenUtil;

    @Autowired
    private ClientAuthRpc clientAuthRpc;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("client interceptor....");
        String token = request.getHeader(tokenHeader);
        IJWTInfo infoFromToken = clientTokenUtil.getInfoFromToken(token);
        String uniqueName = infoFromToken.getUniqueName(); // clientName（code）

        BaseResponse resp = clientAuthRpc.getAllowedClient(clientId, clientSecret);
        if (resp.getStatus() == 200) {
            if (resp instanceof ObjectRestResponse) {
                ObjectRestResponse<List<String>> allowedClient = (ObjectRestResponse<List<String>>) resp;
                for (String client : allowedClient.getData()) {
                    if (client.equals(uniqueName)) {
                        return super.preHandle(request, response, handler);
                    }
                }
            }
        }
        throw new ClientForbiddenException("Client is Forbidden!");
    }
}
