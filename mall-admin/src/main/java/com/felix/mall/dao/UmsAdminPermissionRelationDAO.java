package com.felix.mall.dao;

import com.felix.mall.mbg.entity.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.dao
 * @className UmsAdminPermissionRelationDAO
 * @description 自定义用户权限关系管理DAO
 * @date 2021/2/11 18:02
 */
public interface UmsAdminPermissionRelationDAO {

    /**
     * 批量创建
     * @param list
     * @return
     */
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
