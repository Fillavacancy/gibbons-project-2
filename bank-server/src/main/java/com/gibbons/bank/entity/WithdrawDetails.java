package com.gibbons.bank.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_withdraw_details")
public class WithdrawDetails {
    @Id
    private Integer id;

    @Column(name = "withdraw_time")
    private Date withdrawTime;

    @Column(name = "withdraw_amount")
    private BigDecimal withdrawAmount;

    @Column(name = "account_over")
    private BigDecimal accountOver;

    @Column(name = "withdraw_account_id")
    private Integer withdrawAccountId;

    @Column(name = "withdraw_type")
    private String withdrawType;

    @Column(name = "withdraw_bank_type")
    private String withdrawBankType;

    @Column(name = "withdraw_bank_card_number")
    private String withdrawBankCardNumber;

    @Column(name = "withdraw_summary")
    private String withdrawSummary;

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
     * @return withdraw_time
     */
    public Date getWithdrawTime() {
        return withdrawTime;
    }

    /**
     * @param withdrawTime
     */
    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    /**
     * @return withdraw_amount
     */
    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    /**
     * @param withdrawAmount
     */
    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
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
     * @return withdraw_account_id
     */
    public Integer getWithdrawAccountId() {
        return withdrawAccountId;
    }

    /**
     * @param withdrawAccountId
     */
    public void setWithdrawAccountId(Integer withdrawAccountId) {
        this.withdrawAccountId = withdrawAccountId;
    }

    /**
     * @return withdraw_type
     */
    public String getWithdrawType() {
        return withdrawType;
    }

    /**
     * @param withdrawType
     */
    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }

    /**
     * @return withdraw_bank_type
     */
    public String getWithdrawBankType() {
        return withdrawBankType;
    }

    /**
     * @param withdrawBankType
     */
    public void setWithdrawBankType(String withdrawBankType) {
        this.withdrawBankType = withdrawBankType;
    }

    /**
     * @return withdraw_bank_card_number
     */
    public String getWithdrawBankCardNumber() {
        return withdrawBankCardNumber;
    }

    /**
     * @param withdrawBankCardNumber
     */
    public void setWithdrawBankCardNumber(String withdrawBankCardNumber) {
        this.withdrawBankCardNumber = withdrawBankCardNumber;
    }

    /**
     * @return withdraw_summary
     */
    public String getWithdrawSummary() {
        return withdrawSummary;
    }

    /**
     * @param withdrawSummary
     */
    public void setWithdrawSummary(String withdrawSummary) {
        this.withdrawSummary = withdrawSummary;
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