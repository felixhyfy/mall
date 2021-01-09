package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_subject_product_relation
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class CmsSubjectProductRelation {
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
    private Long productId;

    public CmsSubjectProductRelation(Long id, Long subjectId, Long productId) {
        this.id = id;
        this.subjectId = subjectId;
        this.productId = productId;
    }

    public CmsSubjectProductRelation() {
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}