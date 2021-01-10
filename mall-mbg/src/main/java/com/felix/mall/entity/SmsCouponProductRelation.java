package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_coupon_product_relation
 * @author Felix
 * @date 2021-01-10 21:47:13
 */
public class SmsCouponProductRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long couponId;

    /**
     * 
     */
    private Long productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品编码
     */
    private String productSn;

    public SmsCouponProductRelation(Long id, Long couponId, Long productId, String productName, String productSn) {
        this.id = id;
        this.couponId = couponId;
        this.productId = productId;
        this.productName = productName;
        this.productSn = productSn;
    }

    public SmsCouponProductRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }
}