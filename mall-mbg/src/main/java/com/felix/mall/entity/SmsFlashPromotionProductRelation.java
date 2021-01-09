package com.felix.mall.entity;

import java.math.BigDecimal;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_flash_promotion_product_relation
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class SmsFlashPromotionProductRelation {
    /**
     * 编号
     */
    private Long id;

    /**
     * 
     */
    private Long flashPromotionId;

    /**
     * 编号
     */
    private Long flashPromotionSessionId;

    /**
     * 
     */
    private Long productId;

    /**
     * 限时购价格
     */
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    private Integer flashPromotionLimit;

    /**
     * 排序
     */
    private Integer sort;

    public SmsFlashPromotionProductRelation(Long id, Long flashPromotionId, Long flashPromotionSessionId, Long productId, BigDecimal flashPromotionPrice, Integer flashPromotionCount, Integer flashPromotionLimit, Integer sort) {
        this.id = id;
        this.flashPromotionId = flashPromotionId;
        this.flashPromotionSessionId = flashPromotionSessionId;
        this.productId = productId;
        this.flashPromotionPrice = flashPromotionPrice;
        this.flashPromotionCount = flashPromotionCount;
        this.flashPromotionLimit = flashPromotionLimit;
        this.sort = sort;
    }

    public SmsFlashPromotionProductRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}