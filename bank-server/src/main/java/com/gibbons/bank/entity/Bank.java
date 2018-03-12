package com.gibbons.bank.entity;

import javax.persistence.*;

@Table(name = "bank_bank")
public class Bank {
    @Id
    private Integer id;

    @Column(name = "bank_card_number")
    private String bankCardNumber;

    @Column(name = "belongs_bank")
    private Integer belongsBank;

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
     * @return belongs_bank
     */
    public Integer getBelongsBank() {
        return belongsBank;
    }

    /**
     * @param belongsBank
     */
    public void setBelongsBank(Integer belongsBank) {
        this.belongsBank = belongsBank;
    }
}