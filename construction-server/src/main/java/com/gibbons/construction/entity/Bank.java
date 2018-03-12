package com.gibbons.construction.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Bank {
    @Id
    private Integer id;

    @Column(name = "bank_card_number")
    private String bankCardNumber;

    private String password;

    private BigDecimal over;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "open_account_time")
    private Date openAccountTime;

    private Integer status;

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
     * @return bank_card_number
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * @param bankCardNumber
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return over
     */
    public BigDecimal getOver() {
        return over;
    }

    /**
     * @param over
     */
    public void setOver(BigDecimal over) {
        this.over = over;
    }

    /**
     * @return account_name
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return open_account_time
     */
    public Date getOpenAccountTime() {
        return openAccountTime;
    }

    /**
     * @param openAccountTime
     */
    public void setOpenAccountTime(Date openAccountTime) {
        this.openAccountTime = openAccountTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}