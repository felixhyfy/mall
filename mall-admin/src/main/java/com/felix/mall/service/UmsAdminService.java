package com.felix.mall.service;

import com.felix.mall.entity.UmsAdmin;
import org.springframework.stereotype.Service;

/**
 * @author Felix
 * @packageName com.felix.mall.service
 * @className UmsAdminService
 * @description 后台管理验证登录Service
 * @date 2021/1/10 13:27
 */
@Service
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

}
