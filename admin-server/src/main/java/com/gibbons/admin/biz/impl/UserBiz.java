/**
 * FileName: UserBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/7 16:02
 * Description:
 */
package com.gibbons.admin.biz.impl;

import com.gibbons.admin.biz.IUserBiz;
import com.gibbons.admin.entity.User;
import com.gibbons.admin.jwt.UserAuthUtil;
import com.gibbons.admin.mapper.UserMapper;
import com.gibbons.common.biz.BaseBiz;
import com.gibbons.common.constant.UserConstant;
import com.gibbons.common.util.Query;
import com.gibbons.common.vo.TableResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserAuthUtil userAuthUtil;

    public void insertSelective(User entity) {
        String password = new BCryptPasswordEncoder(UserConstant.PW_ENCORDER_SALT).encode(entity.getPassword());
        entity.setPassword(password);
        super.insertSelective(entity);
    }

    /**
     * 根据用户名获取用户信息
     *
     * @param username
     * @return
     */
    public User getUserByUsername(String username) {
        User user = new User();
        user.setUserName(username);
        return mapper.selectOne(user);
    }

    public void disabled(int id, int status) {
        User user = super.selectById(id);
        if (null != user) {
            if (status == -1 || status == 1) {
                user.setStatus(status);
                mapper.updateByPrimaryKey(user);
            }
        }
    }
}