package com.felix.mall.mapper;

import com.felix.mall.entity.PmsProductFullReduction;

public interface PmsProductFullReductionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction record);

    int insertSelective(PmsProductFullReduction record);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    int updateByPrimaryKey(PmsProductFullReduction record);
}