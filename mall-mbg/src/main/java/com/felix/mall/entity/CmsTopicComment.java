package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_topic_comment
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class CmsTopicComment {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String memberNickName;

    /**
     * 
     */
    private Long topicId;

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

    public CmsTopicComment(Long id, String memberNickName, Long topicId, String memberIcon, String content, Date createTime, Integer showStatus) {
        this.id = id;
        this.memberNickName = memberNickName;
        this.topicId = topicId;
        this.memberIcon = memberIcon;
        this.content = content;
        this.createTime = createTime;
        this.showStatus = showStatus;
    }

    public CmsTopicComment() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName == null ? null : memberNickName.trim();
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
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