/**
 * FileName: BankBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/9 17:55
 * Description:
 */
package com.gibbons.construction.biz.impl;

import com.gibbons.common.biz.BaseBiz;
import com.gibbons.common.constant.UserConstant;
import com.gibbons.common.exception.bank.BankValidateException;
import com.gibbons.common.exception.bank.DepositException;
import com.gibbons.common.exception.bank.TransferException;
import com.gibbons.construction.biz.IBankBiz;
import com.gibbons.construction.entity.Bank;
import com.gibbons.construction.mapper.BankMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/9 17:55
 * @since 1.0.0
 */
@Service
@Transactional
public class BankBiz extends BaseBiz<BankMapper, Bank> implements IBankBiz {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(UserConstant.PW_ENCORDER_SALT);

    /**
     * 验证账户密码
     *
     * @param bankCardNumber 银行卡号
     * @param password       密码
     * @return
     */
    @Override
    public Bank validate(String bankCardNumber, String password) throws BankValidateException {
        Bank bank = this.mapper.selectByBankCardNumber(bankCardNumber);
        if (bank == null || bank.getId() == null) {
            throw new BankValidateException("银行卡不存在!");
        }
        if (!encoder.matches(password, bank.getPassword())) {
            throw new BankValidateException("密码错误!");
        }
        return bank;
    }

    /**
     * 转账
     *
     * @param bankCardNumber 银行卡号
     * @param password       密码
     * @param amount         转账金额
     * @return
     */
    @Override
    public boolean transfer(String bankCardNumber, String password, BigDecimal amount) throws TransferException {
        Bank bank = this.validate(bankCardNumber, password);
        int i = bank.getOver().compareTo(BigDecimal.ZERO);
        if (i == -1) throw new TransferException("余额不足!");
        bank.setOver(bank.getOver().subtract(amount));
        return true;
    }

    /**
     * 存款
     *
     * @param bankCardNumber 银行卡号
     * @param password       密码
     * @param amount         存款金额
     * @return
     */
    @Override
    public boolean deposit(String bankCardNumber, String password, BigDecimal amount) throws DepositException {
        Bank bank = this.validate(bankCardNumber, password);
        bank.setOver(bank.getOver().add(amount));
        return true;
    }
}