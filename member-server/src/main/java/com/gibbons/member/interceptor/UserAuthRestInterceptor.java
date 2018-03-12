package com.gibbons.member.interceptor;

import com.gibbons.common.context.BaseContextHandler;
import com.gibbons.common.util.jwt.IJWTInfo;
import com.gibbons.member.jwt.JWTUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class UserAuthRestInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(UserAuthRestInterceptor.class);

    @Value("${jwt.token-header}")
    private String tokenHeader;

    @Autowired
    private JWTUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("jwt inteceptor....");
        String token = request.getHeader(tokenHeader);
        IJWTInfo infoFromToken = jwtUtil.getInfoFromToken(token);
        BaseContextHandler.setUsername(infoFromToken.getUniqueName());
        BaseContextHandler.setName(infoFromToken.getName());
        BaseContextHandler.setUserID(infoFromToken.getId());
        BaseContextHandler.setToken(token);
        return super.preHandle(request, response, handler);
    }
}