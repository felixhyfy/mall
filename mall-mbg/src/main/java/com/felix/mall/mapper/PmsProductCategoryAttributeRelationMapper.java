package com.felix.mall.mapper;

import com.felix.mall.entity.PmsProductCategoryAttributeRelation;

public interface PmsProductCategoryAttributeRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelation record);

    int insertSelective(PmsProductCategoryAttributeRelation record);

    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation record);

    int updateByPrimaryKey(PmsProductCategoryAttributeRelation record);
}