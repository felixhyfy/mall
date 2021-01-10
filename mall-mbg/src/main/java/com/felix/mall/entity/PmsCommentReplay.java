package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_comment_replay
 * @author Felix
 * @date 2021-01-10 21:47:13
 */
public class PmsCommentReplay {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long commentId;

    /**
     * 
     */
    private String memberNickName;

    /**
     * 
     */
    private String memberIcon;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Date createTime;

    /**
     * 评论人员类型；0->会员；1->管理员
     */
    private Integer type;

    public PmsCommentReplay(Long id, Long commentId, String memberNickName, String memberIcon, String content, Date createTime, Integer type) {
        this.id = id;
        this.commentId = commentId;
        this.memberNickName = memberNickName;
        this.memberIcon = memberIcon;
        this.content = content;
        this.createTime = createTime;
        this.type = type;
    }

    public PmsCommentReplay() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName == null ? null : memberNickName.trim();
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}