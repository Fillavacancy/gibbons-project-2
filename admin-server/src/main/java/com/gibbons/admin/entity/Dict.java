package com.gibbons.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_dict")
public class Dict {

    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 代码
     */
    private String code;

    /**
     * 类型ID
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 字典名
     */
    private String name;

    /**
     * 字典值
     */
    private String value;

    /**
     * 是否是固定值
     */
    private Integer fixed;

    /**
     * 是否默认
     */
    private Integer deft;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取代码
     *
     * @return code - 代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置代码
     *
     * @param code 代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取类型ID
     *
     * @return type_id - 类型ID
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置类型ID
     *
     * @param typeId 类型ID
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取字典名
     *
     * @return name - 字典名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字典名
     *
     * @param name 字典名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取字典值
     *
     * @return value - 字典值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置字典值
     *
     * @param value 字典值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取是否是固定值
     *
     * @return fixed - 是否是固定值
     */
    public Integer getFixed() {
        return fixed;
    }

    /**
     * 设置是否是固定值
     *
     * @param fixed 是否是固定值
     */
    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }

    /**
     * 获取是否默认
     *
     * @return deft - 是否默认
     */
    public Integer getDeft() {
        return deft;
    }

    /**
     * 设置是否默认
     *
     * @param deft 是否默认
     */
    public void setDeft(Integer deft) {
        this.deft = deft;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}