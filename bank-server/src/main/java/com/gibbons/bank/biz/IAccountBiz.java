/**
 * FileName: IAccountBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/12 10:26
 * Description:
 */
package com.gibbons.bank.biz;

import com.gibbons.bank.entity.Account;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/12 10:26
 * @since 1.0.0
 */
public interface IAccountBiz {

    /**
     * 汇款充值
     *
     * @param account 充值账户
     * @return
     */
    Account remittance(Account account);
}