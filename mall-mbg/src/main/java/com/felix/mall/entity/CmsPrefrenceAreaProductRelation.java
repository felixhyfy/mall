package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_prefrence_area_product_relation
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class CmsPrefrenceAreaProductRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long prefrenceAreaId;

    /**
     * 
     */
    private Long productId;

    public CmsPrefrenceAreaProductRelation(Long id, Long prefrenceAreaId, Long productId) {
        this.id = id;
        this.prefrenceAreaId = prefrenceAreaId;
        this.productId = productId;
    }

    public CmsPrefrenceAreaProductRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}