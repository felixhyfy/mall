package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_product_category
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class PmsProductCategory {
    /**
     * 
     */
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    private Long parentId;

    /**
     * 
     */
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    private Integer level;

    /**
     * 
     */
    private Integer productCount;

    /**
     * 
     */
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    private Integer showStatus;

    /**
     * 
     */
    private Integer sort;

    /**
     * 图标
     */
    private String icon;

    /**
     * 
     */
    private String keywords;

    /**
     * 描述
     */
    private String description;

    public PmsProductCategory(Long id, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus, Integer sort, String icon, String keywords) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.productCount = productCount;
        this.productUnit = productUnit;
        this.navStatus = navStatus;
        this.showStatus = showStatus;
        this.sort = sort;
        this.icon = icon;
        this.keywords = keywords;
    }

    public PmsProductCategory(Long id, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus, Integer sort, String icon, String keywords, String description) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.productCount = productCount;
        this.productUnit = productUnit;
        this.navStatus = navStatus;
        this.showStatus = showStatus;
        this.sort = sort;
        this.icon = icon;
        this.keywords = keywords;
        this.description = description;
    }

    public PmsProductCategory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public Integer getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}