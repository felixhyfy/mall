package com.felix.mall.mapper;

import com.felix.mall.entity.UmsIntegrationConsumeSetting;

public interface UmsIntegrationConsumeSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    int insertSelective(UmsIntegrationConsumeSetting record);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}