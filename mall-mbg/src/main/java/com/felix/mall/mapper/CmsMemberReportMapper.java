package com.felix.mall.mapper;

import com.felix.mall.entity.CmsMemberReport;

public interface CmsMemberReportMapper {
    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);
}