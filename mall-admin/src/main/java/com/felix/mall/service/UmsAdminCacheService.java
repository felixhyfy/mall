package com.felix.mall.service;

import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsResource;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.service
 * @className UmsAdminCacheService
 * @description 后台用户缓存操作类
 * @date 2021/1/30 16:22
 */
public interface UmsAdminCacheService {

    /**
     * 删除后台用户缓存
     * @param adminId
     */
    void deleteAdmin(Long adminId);

    /**
     * 删除后台用户资源列表缓存
     * @param adminId
     */
    void deleteResourceList(Long adminId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     * @param roleId
     */
    void deleteResourceListByRole(Long roleId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     * @param roleIds
     */
    void deleteResourceListByIds(List<Long> roleIds);

    /**
     * 当资源信息改变时，删除资源项目后台用户缓存
     * @param resourceId
     */
    void deleteResourceListByResource(Long resourceId);

    /**
     * 获取缓存后台用户信息
     * @param username
     * @return
     */
    UmsAdmin getAdmin(String username);

    /**
     * 设置缓存后台用户信息
     * @param admin
     */
    void setAdmin(UmsAdmin admin);

    /**
     * 获取缓存后台用户资源列表
     * @param adminId
     * @return
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 设置缓存后台用户资源列表
     * @param adminId
     * @param resourceList
     */
    void setResourceList(Long adminId, List<UmsResource> resourceList);
}
