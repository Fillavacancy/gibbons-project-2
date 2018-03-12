package com.gibbons.auth.service;

import com.gibbons.auth.bean.ClientInfo;

import java.util.List;

/**
 * Created by ace on 2017/9/10.
 */
public interface ClientService {

    public ClientInfo apply(String clientId, String secret);

    /**
     * 获取授权的客户端列表
     *
     * @param serviceId
     * @param secret
     * @return
     */
    public List<String> getAllowedClient(String serviceId, String secret);
}
