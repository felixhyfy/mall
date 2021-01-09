package com.felix.mall.mapper;

import com.felix.mall.entity.SmsHomeBrand;

public interface SmsHomeBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeBrand record);

    int insertSelective(SmsHomeBrand record);

    SmsHomeBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeBrand record);

    int updateByPrimaryKey(SmsHomeBrand record);
}