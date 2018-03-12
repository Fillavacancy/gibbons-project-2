package com.gibbons.auth.bean;

import com.gibbons.common.util.jwt.IJWTInfo;

/**
 * Created by ace on 2017/9/10.
 */
public class ClientInfo implements IJWTInfo {

    String clientId;
    String name;
    String id;

    public ClientInfo(String clientId, String name, String id) {
        this.clientId = clientId;
        this.name = name;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户名
     *
     * @return
     */
    @Override
    public String getUniqueName() {
        return clientId;
    }

    /**
     * 获取用户ID
     *
     * @return
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * 获取名称
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }
}
