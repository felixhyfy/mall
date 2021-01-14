package com.felix.mall.mbg.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_member_member_tag_relation
 * @author Felix
 * @date 2021-01-14 21:14:09
 */
public class UmsMemberMemberTagRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 
     */
    private Long tagId;

    public UmsMemberMemberTagRelation(Long id, Long memberId, Long tagId) {
        this.id = id;
        this.memberId = memberId;
        this.tagId = tagId;
    }

    public UmsMemberMemberTagRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}