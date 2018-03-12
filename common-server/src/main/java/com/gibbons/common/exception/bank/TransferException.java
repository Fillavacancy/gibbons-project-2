/**
 * FileName: TransferException
 * Author:   xiangjunzhong
 * Date:     2018/3/12 10:01
 * Description:
 */
package com.gibbons.common.exception.bank;

import com.gibbons.common.constant.CommonConstants;
import com.gibbons.common.exception.BaseException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/12 10:01
 * @since 1.0.0
 */
public class TransferException extends BaseException {

    public TransferException(String message) {
        super(message, CommonConstants.BANK_TRANSFER_CODE);
    }
}