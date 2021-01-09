package com.felix.mall.mapper;

import com.felix.mall.entity.UmsMemberReceiveAddress;

public interface UmsMemberReceiveAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}