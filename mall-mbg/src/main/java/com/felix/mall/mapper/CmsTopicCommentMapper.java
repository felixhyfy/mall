package com.felix.mall.mapper;

import com.felix.mall.entity.CmsTopicComment;

public interface CmsTopicCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    int insertSelective(CmsTopicComment record);

    CmsTopicComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicComment record);

    int updateByPrimaryKey(CmsTopicComment record);
}