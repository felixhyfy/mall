package com.felix.mall.mapper;

import com.felix.mall.entity.SmsFlashPromotionLog;

public interface SmsFlashPromotionLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);
}