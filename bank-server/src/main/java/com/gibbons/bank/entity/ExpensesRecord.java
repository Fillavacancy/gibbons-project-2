package com.gibbons.bank.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_expenses_record")
public class ExpensesRecord {
    @Id
    private Integer id;

    @Column(name = "expenses_time")
    private Date expensesTime;

    @Column(name = "expenses_type")
    private String expensesType;

    @Column(name = "expenses_amount")
    private BigDecimal expensesAmount;

    @Column(name = "account_id")
    private Integer accountId;

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
     * @return expenses_time
     */
    public Date getExpensesTime() {
        return expensesTime;
    }

    /**
     * @param expensesTime
     */
    public void setExpensesTime(Date expensesTime) {
        this.expensesTime = expensesTime;
    }

    /**
     * @return expenses_type
     */
    public String getExpensesType() {
        return expensesType;
    }

    /**
     * @param expensesType
     */
    public void setExpensesType(String expensesType) {
        this.expensesType = expensesType;
    }

    /**
     * @return expenses_amount
     */
    public BigDecimal getExpensesAmount() {
        return expensesAmount;
    }

    /**
     * @param expensesAmount
     */
    public void setExpensesAmount(BigDecimal expensesAmount) {
        this.expensesAmount = expensesAmount;
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