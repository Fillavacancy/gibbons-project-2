package com.gibbons.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class User {

    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 商城密码
     */
    @Column(name = "mall_password")
    private String mallPassword;

    /**
     * 真实姓名
     */
    @Column(name = "actual_name")
    private String actualName;

    /**
     * 证件类型 ID
     */
    @Column(name = "paperwork_type_id")
    private Integer paperworkTypeId;

    /**
     * 证件号码
     */
    @Column(name = "paperwork_number")
    private String paperworkNumber;

    /**
     * 联系电话
     */
    @Column(name = "contact_number")
    private String contactNumber;

    /**
     * 电子邮件
     */
    @Column(name = "e_mail")
    private String eMail;

    /**
     * 身份证图片正
     */
    @Column(name = "id_card_imgz")
    private String idCardImgz;

    /**
     * 身份证图片反
     */
    @Column(name = "id_card_imgf")
    private String idCardImgf;

    /**
     * 用户类型 ID
     */
    @Column(name = "user_type_id")
    private Integer userTypeId;

    /**
     * 注册时间
     */
    @Column(name = "registration_time")
    private Date registrationTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 推荐人
     */
    private String referee;

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
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取商城密码
     *
     * @return mall_password - 商城密码
     */
    public String getMallPassword() {
        return mallPassword;
    }

    /**
     * 设置商城密码
     *
     * @param mallPassword 商城密码
     */
    public void setMallPassword(String mallPassword) {
        this.mallPassword = mallPassword;
    }

    /**
     * 获取真实姓名
     *
     * @return actual_name - 真实姓名
     */
    public String getActualName() {
        return actualName;
    }

    /**
     * 设置真实姓名
     *
     * @param actualName 真实姓名
     */
    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    /**
     * 获取证件类型 ID
     *
     * @return paperwork_type_id - 证件类型 ID
     */
    public Integer getPaperworkTypeId() {
        return paperworkTypeId;
    }

    /**
     * 设置证件类型 ID
     *
     * @param paperworkTypeId 证件类型 ID
     */
    public void setPaperworkTypeId(Integer paperworkTypeId) {
        this.paperworkTypeId = paperworkTypeId;
    }

    /**
     * 获取证件号码
     *
     * @return paperwork_number - 证件号码
     */
    public String getPaperworkNumber() {
        return paperworkNumber;
    }

    /**
     * 设置证件号码
     *
     * @param paperworkNumber 证件号码
     */
    public void setPaperworkNumber(String paperworkNumber) {
        this.paperworkNumber = paperworkNumber;
    }

    /**
     * 获取联系电话
     *
     * @return contact_number - 联系电话
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 设置联系电话
     *
     * @param contactNumber 联系电话
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * 获取电子邮件
     *
     * @return e_mail - 电子邮件
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 设置电子邮件
     *
     * @param eMail 电子邮件
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取身份证图片正
     *
     * @return id_card_imgz - 身份证图片正
     */
    public String getIdCardImgz() {
        return idCardImgz;
    }

    /**
     * 设置身份证图片正
     *
     * @param idCardImgz 身份证图片正
     */
    public void setIdCardImgz(String idCardImgz) {
        this.idCardImgz = idCardImgz;
    }

    /**
     * 获取身份证图片反
     *
     * @return id_card_imgf - 身份证图片反
     */
    public String getIdCardImgf() {
        return idCardImgf;
    }

    /**
     * 设置身份证图片反
     *
     * @param idCardImgf 身份证图片反
     */
    public void setIdCardImgf(String idCardImgf) {
        this.idCardImgf = idCardImgf;
    }

    /**
     * 获取用户类型 ID
     *
     * @return user_type_id - 用户类型 ID
     */
    public Integer getUserTypeId() {
        return userTypeId;
    }

    /**
     * 设置用户类型 ID
     *
     * @param userTypeId 用户类型 ID
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * 获取注册时间
     *
     * @return registration_time - 注册时间
     */
    public Date getRegistrationTime() {
        return registrationTime;
    }

    /**
     * 设置注册时间
     *
     * @param registrationTime 注册时间
     */
    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
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
     * 获取推荐人
     *
     * @return referee - 推荐人
     */
    public String getReferee() {
        return referee;
    }

    /**
     * 设置推荐人
     *
     * @param referee 推荐人
     */
    public void setReferee(String referee) {
        this.referee = referee;
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