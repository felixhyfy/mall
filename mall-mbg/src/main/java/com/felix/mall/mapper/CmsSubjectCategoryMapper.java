package com.felix.mall.mapper;

import com.felix.mall.entity.CmsSubjectCategory;

public interface CmsSubjectCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectCategory record);

    int insertSelective(CmsSubjectCategory record);

    CmsSubjectCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    int updateByPrimaryKey(CmsSubjectCategory record);
}