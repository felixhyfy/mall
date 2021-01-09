package com.felix.mall.mapper;

import com.felix.mall.entity.UmsMemberTask;

public interface UmsMemberTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask record);

    int insertSelective(UmsMemberTask record);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTask record);

    int updateByPrimaryKey(UmsMemberTask record);
}