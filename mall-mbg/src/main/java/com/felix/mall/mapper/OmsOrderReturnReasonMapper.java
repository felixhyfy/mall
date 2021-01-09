package com.felix.mall.mapper;

import com.felix.mall.entity.OmsOrderReturnReason;

public interface OmsOrderReturnReasonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnReason record);

    int insertSelective(OmsOrderReturnReason record);

    OmsOrderReturnReason selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    int updateByPrimaryKey(OmsOrderReturnReason record);
}