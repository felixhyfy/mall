package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_subject
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class CmsSubject {
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
    private String title;

    /**
     * 专题主图
     */
    private String pic;

    /**
     * 关联产品数量
     */
    private Integer productCount;

    /**
     * 
     */
    private Integer recommendStatus;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer collectCount;

    /**
     * 
     */
    private Integer readCount;

    /**
     * 
     */
    private Integer commentCount;

    /**
     * 画册图片用逗号分割
     */
    private String albumPics;

    /**
     * 
     */
    private String description;

    /**
     * 显示状态：0->不显示；1->显示
     */
    private Integer showStatus;

    /**
     * 转发数
     */
    private Integer forwardCount;

    /**
     * 专题分类名称
     */
    private String categoryName;

    /**
     * 
     */
    private String content;

    public CmsSubject(Long id, Long categoryId, String title, String pic, Integer productCount, Integer recommendStatus, Date createTime, Integer collectCount, Integer readCount, Integer commentCount, String albumPics, String description, Integer showStatus, Integer forwardCount, String categoryName) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.pic = pic;
        this.productCount = productCount;
        this.recommendStatus = recommendStatus;
        this.createTime = createTime;
        this.collectCount = collectCount;
        this.readCount = readCount;
        this.commentCount = commentCount;
        this.albumPics = albumPics;
        this.description = description;
        this.showStatus = showStatus;
        this.forwardCount = forwardCount;
        this.categoryName = categoryName;
    }

    public CmsSubject(Long id, Long categoryId, String title, String pic, Integer productCount, Integer recommendStatus, Date createTime, Integer collectCount, Integer readCount, Integer commentCount, String albumPics, String description, Integer showStatus, Integer forwardCount, String categoryName, String content) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.pic = pic;
        this.productCount = productCount;
        this.recommendStatus = recommendStatus;
        this.createTime = createTime;
        this.collectCount = collectCount;
        this.readCount = readCount;
        this.commentCount = commentCount;
        this.albumPics = albumPics;
        this.description = description;
        this.showStatus = showStatus;
        this.forwardCount = forwardCount;
        this.categoryName = categoryName;
        this.content = content;
    }

    public CmsSubject() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}