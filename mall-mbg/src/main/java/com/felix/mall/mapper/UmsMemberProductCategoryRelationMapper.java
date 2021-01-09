package com.felix.mall.mapper;

import com.felix.mall.entity.UmsMemberProductCategoryRelation;

public interface UmsMemberProductCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberProductCategoryRelation record);

    int insertSelective(UmsMemberProductCategoryRelation record);

    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);
}