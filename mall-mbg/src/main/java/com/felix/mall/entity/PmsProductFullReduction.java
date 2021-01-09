package com.felix.mall.entity;

import java.math.BigDecimal;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_product_full_reduction
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class PmsProductFullReduction {
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
    private BigDecimal fullPrice;

    /**
     * 
     */
    private BigDecimal reducePrice;

    public PmsProductFullReduction(Long id, Long productId, BigDecimal fullPrice, BigDecimal reducePrice) {
        this.id = id;
        this.productId = productId;
        this.fullPrice = fullPrice;
        this.reducePrice = reducePrice;
    }

    public PmsProductFullReduction() {
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

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }
}