package com.gibbons.information.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "info_msgs")
public class Msgs {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 发送时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 阅读时间
     */
    @Column(name = "read_time")
    private Date readTime;

    /**
     * 留言类型
     */
    private Integer type;

    /**
     * 留言的主人
     */
    private Integer user;

    /**
     * 对方的ID
     */
    private Integer friend;

    /**
     * 留言发送者
     */
    private Integer sender;

    /**
     * 留言接收者
     */
    private Integer receiver;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 留言内容
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
     * 获取发送时间
     *
     * @return send_time - 发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发送时间
     *
     * @param sendTime 发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取阅读时间
     *
     * @return read_time - 阅读时间
     */
    public Date getReadTime() {
        return readTime;
    }

    /**
     * 设置阅读时间
     *
     * @param readTime 阅读时间
     */
    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    /**
     * 获取留言类型
     *
     * @return type - 留言类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置留言类型
     *
     * @param type 留言类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取留言的主人
     *
     * @return user - 留言的主人
     */
    public Integer getUser() {
        return user;
    }

    /**
     * 设置留言的主人
     *
     * @param user 留言的主人
     */
    public void setUser(Integer user) {
        this.user = user;
    }

    /**
     * 获取对方的ID
     *
     * @return friend - 对方的ID
     */
    public Integer getFriend() {
        return friend;
    }

    /**
     * 设置对方的ID
     *
     * @param friend 对方的ID
     */
    public void setFriend(Integer friend) {
        this.friend = friend;
    }

    /**
     * 获取留言发送者
     *
     * @return sender - 留言发送者
     */
    public Integer getSender() {
        return sender;
    }

    /**
     * 设置留言发送者
     *
     * @param sender 留言发送者
     */
    public void setSender(Integer sender) {
        this.sender = sender;
    }

    /**
     * 获取留言接收者
     *
     * @return receiver - 留言接收者
     */
    public Integer getReceiver() {
        return receiver;
    }

    /**
     * 设置留言接收者
     *
     * @param receiver 留言接收者
     */
    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
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
     * 获取留言内容
     *
     * @return content - 留言内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置留言内容
     *
     * @param content 留言内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}