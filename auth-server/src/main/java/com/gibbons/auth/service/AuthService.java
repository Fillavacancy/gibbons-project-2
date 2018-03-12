/**
 * FileName: AuthService
 * Author:   xiangjunzhong
 * Date:     2018/3/2 10:51
 * Description:
 */
package com.gibbons.auth.service;

import com.gibbons.auth.bean.UserInfo;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 10:51
 * @since 1.0.0
 */
public interface AuthService {

    String login(String username, String password) throws Exception;

    String refresh(String oldToken) throws Exception;
}