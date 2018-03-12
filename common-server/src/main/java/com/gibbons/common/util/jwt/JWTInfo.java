package com.gibbons.common.util.jwt;

import java.io.Serializable;

/**
 * Created by ace on 2017/9/10.
 */
public class JWTInfo implements Serializable, IJWTInfo {

    private String username;
    private String userId;
    private String name;

    public JWTInfo(String username, String userId, String name) {
        this.username = username;
        this.userId = userId;
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return
     */
    @Override
    public String getUniqueName() {
        return username;
    }

    /**
     * 获取用户ID
     *
     * @return
     */
    @Override
    public String getId() {
        return userId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        JWTInfo jwtInfo = (JWTInfo) o;

        if (username != null ? !username.equals(jwtInfo.username) : jwtInfo.username != null) {
            return false;
        }
        return userId != null ? userId.equals(jwtInfo.userId) : jwtInfo.userId == null;

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
