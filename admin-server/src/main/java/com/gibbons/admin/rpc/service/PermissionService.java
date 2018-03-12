package com.gibbons.admin.rpc.service;

import com.gibbons.admin.biz.impl.UserBiz;
import com.gibbons.admin.entity.User;
import com.gibbons.admin.jwt.UserAuthUtil;
import com.gibbons.admin.vo.user.UserInfo;
import com.gibbons.common.constant.UserConstant;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by ace on 2017/9/12.
 */
@Service
public class PermissionService {

    @Autowired
    private UserBiz userBiz;

    @Autowired
    private UserAuthUtil userAuthUtil;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(UserConstant.PW_ENCORDER_SALT);


    public UserInfo getUserByUsername(String username) {
        UserInfo info = new UserInfo();
        User user = userBiz.getUserByUsername(username);
        BeanUtils.copyProperties(user, info);
        info.setId(user.getId().toString());
        return info;
    }

    public UserInfo validate(String username, String password) {
        UserInfo info = new UserInfo();
        User user = userBiz.getUserByUsername(username);
        if (null != user) {
            if (encoder.matches(password, user.getPassword())) {
                BeanUtils.copyProperties(user, info);
                info.setId(user.getId().toString());
            }
        }
        return info;
    }
}
