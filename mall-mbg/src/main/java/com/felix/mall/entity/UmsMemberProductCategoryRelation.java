package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_member_product_category_relation
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class UmsMemberProductCategoryRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 
     */
    private Long productCategoryId;

    public UmsMemberProductCategoryRelation(Long id, Long memberId, Long productCategoryId) {
        this.id = id;
        this.memberId = memberId;
        this.productCategoryId = productCategoryId;
    }

    public UmsMemberProductCategoryRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
}