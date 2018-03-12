/**
 * FileName: IBankBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/12 10:24
 * Description:
 */
package com.gibbons.construction.biz;

import com.gibbons.common.exception.bank.BankValidateException;
import com.gibbons.common.exception.bank.DepositException;
import com.gibbons.common.exception.bank.TransferException;
import com.gibbons.construction.entity.Bank;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/12 10:24
 * @since 1.0.0
 */
public interface IBankBiz {


    /**
     * 验证账户密码
     *
     * @param bankCardNumber 银行卡号
     * @param password       密码
     * @return
     */
    Bank validate(String bankCardNumber, String password) throws BankValidateException;

    /**
     * 转账
     *
     * @param bankCardNumber 银行卡号
     * @param password       密码
     * @param amount         转账金额
     * @return
     */
    boolean transfer(String bankCardNumber, String password, BigDecimal amount) throws TransferException;

    /**
     * 存款
     *
     * @param bankCardNumber 银行卡号
     * @param password       密码
     * @param amount         存款金额
     * @return
     */
    boolean deposit(String bankCardNumber, String password, BigDecimal amount) throws DepositException;
}