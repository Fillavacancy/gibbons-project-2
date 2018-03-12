package com.gibbons.auth.util;

import com.gibbons.common.util.jwt.IJWTInfo;
import com.gibbons.common.util.jwt.JWTHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ace on 2017/9/10.
 */
@Configuration
public class JWTTokenUtil {

    @Value("${jwt.expire}")
    private int expire;

    @Value("${jwt.pri-key.path}")
    private String priKeyPath;

    @Value("${jwt.pub-key.path}")
    private String pubKeyPath;

    public String generateToken(IJWTInfo jwtInfo) throws Exception {
        return JWTHelper.generateToken(jwtInfo, priKeyPath, expire);
    }

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token, pubKeyPath);
    }
}
