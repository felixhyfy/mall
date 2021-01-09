package com.felix.mall.mapper;

import com.felix.mall.entity.CmsSubjectProductRelation;

public interface CmsSubjectProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelation record);

    int insertSelective(CmsSubjectProductRelation record);

    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    int updateByPrimaryKey(CmsSubjectProductRelation record);
}