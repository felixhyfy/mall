package com.felix.mall.dao;

import com.felix.mall.mbg.entity.UmsAdminRoleRelation;
import com.felix.mall.mbg.entity.UmsPermission;
import com.felix.mall.mbg.entity.UmsResource;
import com.felix.mall.mbg.entity.UmsRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.dao
 * @className UmsAdminRoleRelationDAO
 * @description 后台用户与角色管理自定义Dao
 * @date 2021/1/10 20:28
 */
public interface UmsAdminRoleRelationDAO {

    /**
     * 批量插入用户角色关系
     * @param adminRoleRelationList
     * @return
     */
    int insertList(@Param("list")List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 用户获取所有角色
     * @param adminId
     * @return
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     * @param adminId
     * @return
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限（包括+-权限）
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     * @param adminId
     * @return
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 获取资源相关用户ID列表
     * @param resourceId
     * @return
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
