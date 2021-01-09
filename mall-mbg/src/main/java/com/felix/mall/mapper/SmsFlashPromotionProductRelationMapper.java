package com.felix.mall.mapper;

import com.felix.mall.entity.SmsFlashPromotionProductRelation;

public interface SmsFlashPromotionProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    int insertSelective(SmsFlashPromotionProductRelation record);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);
}