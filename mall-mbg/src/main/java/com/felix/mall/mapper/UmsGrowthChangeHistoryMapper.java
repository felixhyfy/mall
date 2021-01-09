package com.felix.mall.mapper;

import com.felix.mall.entity.UmsGrowthChangeHistory;

public interface UmsGrowthChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistory record);

    int insertSelective(UmsGrowthChangeHistory record);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}