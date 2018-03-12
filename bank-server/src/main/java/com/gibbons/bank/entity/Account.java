package com.gibbons.bank.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "bank_account")
public class Account {
    @Id
    private Integer id;

    private BigDecimal over;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "sms_remind")
    private Integer smsRemind;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return sms_remind
     */
    public Integer getSmsRemind() {
        return smsRemind;
    }

    /**
     * @param smsRemind
     */
    public void setSmsRemind(Integer smsRemind) {
        this.smsRemind = smsRemind;
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