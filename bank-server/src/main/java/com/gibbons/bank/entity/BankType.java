package com.gibbons.bank.entity;

import javax.persistence.*;

@Table(name = "bank_bank_type")
public class BankType {
    @Id
    private Integer id;

    @Column(name = "type_name")
    private String typeName;

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
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}