package com.felix.mall.mapper;

import com.felix.mall.entity.SmsCouponProductCategoryRelation;
import com.felix.mall.entity.SmsCouponProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponProductCategoryRelationMapper {
    long countByExample(SmsCouponProductCategoryRelationExample example);

    int deleteByExample(SmsCouponProductCategoryRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelation record);

    int insertSelective(SmsCouponProductCategoryRelation record);

    List<SmsCouponProductCategoryRelation> selectByExample(SmsCouponProductCategoryRelationExample example);

    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCouponProductCategoryRelation record, @Param("example") SmsCouponProductCategoryRelationExample example);

    int updateByExample(@Param("record") SmsCouponProductCategoryRelation record, @Param("example") SmsCouponProductCategoryRelationExample example);

    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);
}