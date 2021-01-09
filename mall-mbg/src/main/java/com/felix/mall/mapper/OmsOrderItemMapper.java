package com.felix.mall.mapper;

import com.felix.mall.entity.OmsOrderItem;

public interface OmsOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);
}