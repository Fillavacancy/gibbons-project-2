package com.gibbons.bank.entity;

import javax.persistence.*;

@Table(name = "bank_account_bank")
public class AccountBank {
    @Id
    private Integer id;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "bank_id")
    private Integer bankId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return account_id
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * @param accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * @return bank_id
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * @param bankId
     */
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }
}