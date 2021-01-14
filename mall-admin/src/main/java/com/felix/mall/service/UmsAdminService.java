package com.felix.mall.service;

import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsPermission;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.service
 * @className UmsAdminService
 * @description 后台管理验证登录Service
 * @date 2021/1/10 13:27
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username
     * @param password
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);

}
