/**
 * FileName: AccountBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/12 10:22
 * Description:
 */
package com.gibbons.bank.biz.impl;

import com.gibbons.bank.biz.IAccountBiz;
import com.gibbons.bank.entity.Account;
import com.gibbons.bank.mapper.AccountMapper;
import com.gibbons.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/12 10:22
 * @since 1.0.0
 */
@Service
@Transactional
public class AccountBiz extends BaseBiz<AccountMapper, Account> implements IAccountBiz {

    /**
     * 汇款充值
     *
     * @param account 充值账户
     * @return
     */
    @Override
    public Account remittance(Account account) {
        return null;
    }
}