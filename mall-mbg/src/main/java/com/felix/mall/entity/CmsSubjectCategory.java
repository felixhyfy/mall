package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_subject_category
 * @author Felix
 * @date 2021-01-10 21:47:13
 */
public class CmsSubjectCategory {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 分类图标
     */
    private String icon;

    /**
     * 专题数量
     */
    private Integer subjectCount;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 
     */
    private Integer sort;

    public CmsSubjectCategory(Long id, String name, String icon, Integer subjectCount, Integer showStatus, Integer sort) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.subjectCount = subjectCount;
        this.showStatus = showStatus;
        this.sort = sort;
    }

    public CmsSubjectCategory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getSubjectCount() {
        return subjectCount;
    }

    public void setSubjectCount(Integer subjectCount) {
        this.subjectCount = subjectCount;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}