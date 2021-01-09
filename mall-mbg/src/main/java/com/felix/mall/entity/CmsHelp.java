package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_help
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class CmsHelp {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long categoryId;

    /**
     * 
     */
    private String icon;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer readCount;

    /**
     * 
     */
    private String content;

    public CmsHelp(Long id, Long categoryId, String icon, String title, Integer showStatus, Date createTime, Integer readCount) {
        this.id = id;
        this.categoryId = categoryId;
        this.icon = icon;
        this.title = title;
        this.showStatus = showStatus;
        this.createTime = createTime;
        this.readCount = readCount;
    }

    public CmsHelp(Long id, Long categoryId, String icon, String title, Integer showStatus, Date createTime, Integer readCount, String content) {
        this.id = id;
        this.categoryId = categoryId;
        this.icon = icon;
        this.title = title;
        this.showStatus = showStatus;
        this.createTime = createTime;
        this.readCount = readCount;
        this.content = content;
    }

    public CmsHelp() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}