/**
 * FileName: UserTokenException
 * Author:   xiangjunzhong
 * Date:     2018/3/2 14:44
 * Description:
 */
package com.gibbons.common.exception.auth;

import com.gibbons.common.constant.CommonConstants;
import com.gibbons.common.exception.BaseException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 14:44
 * @since 1.0.0
 */
public class UserTokenException extends BaseException {

    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}