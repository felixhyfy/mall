package com.felix.mall.mbg.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_home_recommend_product
 * @author Felix
 * @date 2021-01-14 21:14:09
 */
public class SmsHomeRecommendProduct {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long productId;

    /**
     * 
     */
    private String productName;

    /**
     * 
     */
    private Integer recommendStatus;

    /**
     * 
     */
    private Integer sort;

    public SmsHomeRecommendProduct(Long id, Long productId, String productName, Integer recommendStatus, Integer sort) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.recommendStatus = recommendStatus;
        this.sort = sort;
    }

    public SmsHomeRecommendProduct() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}