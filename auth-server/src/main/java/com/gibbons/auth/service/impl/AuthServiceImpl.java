/**
 * FileName: LocalUserService
 * Author:   xiangjunzhong
 * Date:     2018/3/2 10:52
 * Description:
 */
package com.gibbons.auth.service.impl;

import com.gibbons.auth.bean.UserInfo;
import com.gibbons.auth.feign.IUserService;
import com.gibbons.auth.service.AuthService;
import com.gibbons.auth.util.JWTTokenUtil;
import com.gibbons.common.util.jwt.IJWTInfo;
import com.gibbons.common.util.jwt.JWTInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 10:52
 * @since 1.0.0
 */
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private JWTTokenUtil jwtTokenUtil;

    @Autowired
    private IUserService userService;

    @Override
    public String login(String username, String password) throws Exception {
        UserInfo info = userService.validate(username, password);
        String token = "";
        if (!StringUtils.isEmpty(info.getId())) {
            token = jwtTokenUtil.generateToken(new JWTInfo(info.getUniqueName(), info.getId(), info.getName()));
        }
        return token;
    }

    @Override
    public String refresh(String oldToken) throws Exception {
        IJWTInfo infoFromToken = jwtTokenUtil.getInfoFromToken(oldToken);
        String token = null;
        if (infoFromToken instanceof JWTInfo) {
            JWTInfo info = (JWTInfo) infoFromToken;
            if (!StringUtils.isEmpty(info.getId())) {
                token = jwtTokenUtil.generateToken(new JWTInfo(info.getUniqueName(), info.getId(), info.getName()));
            }
        }
        return token;
    }
}