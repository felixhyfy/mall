package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_product_attribute_category
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class PmsProductAttributeCategory {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 属性数量
     */
    private Integer attributeCount;

    /**
     * 参数数量
     */
    private Integer paramCount;

    public PmsProductAttributeCategory(Long id, String name, Integer attributeCount, Integer paramCount) {
        this.id = id;
        this.name = name;
        this.attributeCount = attributeCount;
        this.paramCount = paramCount;
    }

    public PmsProductAttributeCategory() {
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

    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    public Integer getParamCount() {
        return paramCount;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }
}