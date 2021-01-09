package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_subject_comment
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class CmsSubjectComment {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long subjectId;

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
     * 
     */
    private Integer showStatus;

    public CmsSubjectComment(Long id, Long subjectId, String memberNickName, String memberIcon, String content, Date createTime, Integer showStatus) {
        this.id = id;
        this.subjectId = subjectId;
        this.memberNickName = memberNickName;
        this.memberIcon = memberIcon;
        this.content = content;
        this.createTime = createTime;
        this.showStatus = showStatus;
    }

    public CmsSubjectComment() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
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

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }
}