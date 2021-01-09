package com.felix.mall.mapper;

import com.felix.mall.entity.UmsResourceCategory;

public interface UmsResourceCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsResourceCategory record);

    int insertSelective(UmsResourceCategory record);

    UmsResourceCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsResourceCategory record);

    int updateByPrimaryKey(UmsResourceCategory record);
}