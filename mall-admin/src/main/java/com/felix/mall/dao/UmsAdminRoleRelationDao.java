package com.felix.mall.dao;

import com.felix.mall.entity.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.dao
 * @className UmsAdminRoleRelationDao
 * @description 后台用户与角色管理自定义Dao
 * @date 2021/1/10 20:28
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限（包括+-权限）
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
