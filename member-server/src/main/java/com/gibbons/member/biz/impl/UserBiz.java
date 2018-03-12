/**
 * FileName: UserBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/7 16:02
 * Description:
 */
package com.gibbons.member.biz.impl;

import com.gibbons.common.biz.BaseBiz;
import com.gibbons.common.constant.UserConstant;
import com.gibbons.member.biz.IUserBiz;
import com.gibbons.member.entity.User;
import com.gibbons.member.mapper.UserMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/7 16:02
 * @since 1.0.0
 */
@Service
@Transactional
public class UserBiz extends BaseBiz<UserMapper, User> implements IUserBiz {

    @Override
    public void updatePassword(int id, String password) {
        String pwd = new BCryptPasswordEncoder(UserConstant.PW_ENCORDER_SALT).encode(password);
        User user = new User();
        user.setId(id);
        user.setPassword(pwd);
        super.updateById(user);
    }
}