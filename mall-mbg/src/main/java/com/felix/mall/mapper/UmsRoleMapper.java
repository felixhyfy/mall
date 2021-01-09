package com.felix.mall.mapper;

import com.felix.mall.entity.UmsRole;

public interface UmsRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRole record);

    int insertSelective(UmsRole record);

    UmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRole record);

    int updateByPrimaryKey(UmsRole record);
}