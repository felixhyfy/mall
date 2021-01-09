package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_product_attribute
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class PmsProductAttribute {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productAttributeCategoryId;

    /**
     * 
     */
    private String name;

    /**
     * 属性选择类型：0->唯一；1->单选；2->多选
     */
    private Integer selectType;

    /**
     * 属性录入方式：0->手工录入；1->从列表中选取
     */
    private Integer inputType;

    /**
     * 可选值列表，以逗号隔开
     */
    private String inputList;

    /**
     * 排序字段：最高的可以单独上传图片
     */
    private Integer sort;

    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    private Integer filterType;

    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    private Integer searchType;

    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    private Integer relatedStatus;

    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    private Integer handAddStatus;

    /**
     * 属性的类型；0->规格；1->参数
     */
    private Integer type;

    public PmsProductAttribute(Long id, Long productAttributeCategoryId, String name, Integer selectType, Integer inputType, String inputList, Integer sort, Integer filterType, Integer searchType, Integer relatedStatus, Integer handAddStatus, Integer type) {
        this.id = id;
        this.productAttributeCategoryId = productAttributeCategoryId;
        this.name = name;
        this.selectType = selectType;
        this.inputType = inputType;
        this.inputList = inputList;
        this.sort = sort;
        this.filterType = filterType;
        this.searchType = searchType;
        this.relatedStatus = relatedStatus;
        this.handAddStatus = handAddStatus;
        this.type = type;
    }

    public PmsProductAttribute() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSelectType() {
        return selectType;
    }

    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public String getInputList() {
        return inputList;
    }

    public void setInputList(String inputList) {
        this.inputList = inputList == null ? null : inputList.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}