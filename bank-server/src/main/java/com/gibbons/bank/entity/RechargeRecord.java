package com.gibbons.bank.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_recharge_record")
public class RechargeRecord {
    @Id
    private Integer id;

    @Column(name = "recharge_time")
    private Date rechargeTime;

    @Column(name = "recharge_number")
    private String rechargeNumber;

    @Column(name = "recharge_amount")
    private BigDecimal rechargeAmount;

    @Column(name = "account_over")
    private BigDecimal accountOver;

    @Column(name = "recharge_bank_type")
    private String rechargeBankType;

    @Column(name = "recharge_bank_card_number")
    private String rechargeBankCardNumber;

    @Column(name = "recharge_account_id")
    private Integer rechargeAccountId;

    @Column(name = "be_recharge_account_id")
    private Integer beRechargeAccountId;

    private String summary;

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
     * @return recharge_time
     */
    public Date getRechargeTime() {
        return rechargeTime;
    }

    /**
     * @param rechargeTime
     */
    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    /**
     * @return recharge_number
     */
    public String getRechargeNumber() {
        return rechargeNumber;
    }

    /**
     * @param rechargeNumber
     */
    public void setRechargeNumber(String rechargeNumber) {
        this.rechargeNumber = rechargeNumber;
    }

    /**
     * @return recharge_amount
     */
    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    /**
     * @param rechargeAmount
     */
    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    /**
     * @return account_over
     */
    public BigDecimal getAccountOver() {
        return accountOver;
    }

    /**
     * @param accountOver
     */
    public void setAccountOver(BigDecimal accountOver) {
        this.accountOver = accountOver;
    }

    /**
     * @return recharge_bank_type
     */
    public String getRechargeBankType() {
        return rechargeBankType;
    }

    /**
     * @param rechargeBankType
     */
    public void setRechargeBankType(String rechargeBankType) {
        this.rechargeBankType = rechargeBankType;
    }

    /**
     * @return recharge_bank_card_number
     */
    public String getRechargeBankCardNumber() {
        return rechargeBankCardNumber;
    }

    /**
     * @param rechargeBankCardNumber
     */
    public void setRechargeBankCardNumber(String rechargeBankCardNumber) {
        this.rechargeBankCardNumber = rechargeBankCardNumber;
    }

    /**
     * @return recharge_account_id
     */
    public Integer getRechargeAccountId() {
        return rechargeAccountId;
    }

    /**
     * @param rechargeAccountId
     */
    public void setRechargeAccountId(Integer rechargeAccountId) {
        this.rechargeAccountId = rechargeAccountId;
    }

    /**
     * @return be_recharge_account_id
     */
    public Integer getBeRechargeAccountId() {
        return beRechargeAccountId;
    }

    /**
     * @param beRechargeAccountId
     */
    public void setBeRechargeAccountId(Integer beRechargeAccountId) {
        this.beRechargeAccountId = beRechargeAccountId;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}