package com.gibbons.bank.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_trading_water")
public class TradingWater {
    @Id
    private Integer id;

    @Column(name = "water_number")
    private String waterNumber;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "bank_type")
    private String bankType;

    @Column(name = "bank_card_number")
    private String bankCardNumber;

    @Column(name = "transaction_time")
    private Date transactionTime;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @Column(name = "last_over")
    private BigDecimal lastOver;

    @Column(name = "account_over")
    private BigDecimal accountOver;

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
     * @return water_number
     */
    public String getWaterNumber() {
        return waterNumber;
    }

    /**
     * @param waterNumber
     */
    public void setWaterNumber(String waterNumber) {
        this.waterNumber = waterNumber;
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
     * @return bank_type
     */
    public String getBankType() {
        return bankType;
    }

    /**
     * @param bankType
     */
    public void setBankType(String bankType) {
        this.bankType = bankType;
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
     * @return transaction_time
     */
    public Date getTransactionTime() {
        return transactionTime;
    }

    /**
     * @param transactionTime
     */
    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * @return transaction_type
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * @return transaction_amount
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount
     */
    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return last_over
     */
    public BigDecimal getLastOver() {
        return lastOver;
    }

    /**
     * @param lastOver
     */
    public void setLastOver(BigDecimal lastOver) {
        this.lastOver = lastOver;
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