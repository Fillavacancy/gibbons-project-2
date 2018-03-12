package com.gibbons.information.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "info_advisory")
public class Advisory {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 标题
     */
    private String title;

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
     * 发布时间
     */
    @Column(name = "release_time")
    private Date releaseTime;

    /**
     * 发布人ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 权重
     */
    private Float weights;

    /**
     * 附件类别
     */
    @Column(name = "annex_type")
    private Integer annexType;

    /**
     * 附件存放路径
     */
    @Column(name = "annex_storage_path")
    private String annexStoragePath;

    /**
     * 附件大小
     */
    @Column(name = "annex_size")
    private Integer annexSize;

    /**
     * 附件上传时间
     */
    @Column(name = "annex_upload_time")
    private Date annexUploadTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 内容
     */
    private String content;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
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
     * 获取发布时间
     *
     * @return release_time - 发布时间
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * 设置发布时间
     *
     * @param releaseTime 发布时间
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * 获取发布人ID
     *
     * @return user_id - 发布人ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置发布人ID
     *
     * @param userId 发布人ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取权重
     *
     * @return weights - 权重
     */
    public Float getWeights() {
        return weights;
    }

    /**
     * 设置权重
     *
     * @param weights 权重
     */
    public void setWeights(Float weights) {
        this.weights = weights;
    }

    /**
     * 获取附件类别
     *
     * @return annex_type - 附件类别
     */
    public Integer getAnnexType() {
        return annexType;
    }

    /**
     * 设置附件类别
     *
     * @param annexType 附件类别
     */
    public void setAnnexType(Integer annexType) {
        this.annexType = annexType;
    }

    /**
     * 获取附件存放路径
     *
     * @return annex_storage_path - 附件存放路径
     */
    public String getAnnexStoragePath() {
        return annexStoragePath;
    }

    /**
     * 设置附件存放路径
     *
     * @param annexStoragePath 附件存放路径
     */
    public void setAnnexStoragePath(String annexStoragePath) {
        this.annexStoragePath = annexStoragePath;
    }

    /**
     * 获取附件大小
     *
     * @return annex_size - 附件大小
     */
    public Integer getAnnexSize() {
        return annexSize;
    }

    /**
     * 设置附件大小
     *
     * @param annexSize 附件大小
     */
    public void setAnnexSize(Integer annexSize) {
        this.annexSize = annexSize;
    }

    /**
     * 获取附件上传时间
     *
     * @return annex_upload_time - 附件上传时间
     */
    public Date getAnnexUploadTime() {
        return annexUploadTime;
    }

    /**
     * 设置附件上传时间
     *
     * @param annexUploadTime 附件上传时间
     */
    public void setAnnexUploadTime(Date annexUploadTime) {
        this.annexUploadTime = annexUploadTime;
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

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}