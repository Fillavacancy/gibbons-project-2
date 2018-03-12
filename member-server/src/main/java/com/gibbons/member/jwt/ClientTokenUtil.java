package com.gibbons.member.jwt;

import com.gibbons.common.util.jwt.IJWTInfo;
import com.gibbons.common.util.jwt.JWTHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ace on 2017/9/10.
 */
@Configuration
public class ClientTokenUtil {

    @Value("${client.pub-key.path}")
    private String pubKeyPath;

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token, pubKeyPath);
    }
}
