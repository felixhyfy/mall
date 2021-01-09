package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_product_category_attribute_relation
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class PmsProductCategoryAttributeRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productCategoryId;

    /**
     * 
     */
    private Long productAttributeId;

    public PmsProductCategoryAttributeRelation(Long id, Long productCategoryId, Long productAttributeId) {
        this.id = id;
        this.productCategoryId = productCategoryId;
        this.productAttributeId = productAttributeId;
    }

    public PmsProductCategoryAttributeRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }
}