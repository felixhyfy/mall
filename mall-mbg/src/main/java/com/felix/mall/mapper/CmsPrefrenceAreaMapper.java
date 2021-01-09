package com.felix.mall.mapper;

import com.felix.mall.entity.CmsPrefrenceArea;

public interface CmsPrefrenceAreaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);
}