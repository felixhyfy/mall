package com.felix.mall.mapper;

import com.felix.mall.entity.SmsFlashPromotionSession;

public interface SmsFlashPromotionSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession record);

    int insertSelective(SmsFlashPromotionSession record);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    int updateByPrimaryKey(SmsFlashPromotionSession record);
}