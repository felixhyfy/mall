package com.felix.mall.entity;

import java.math.BigDecimal;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_member_price
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class PmsMemberPrice {
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
    private Long memberLevelId;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    /**
     * 
     */
    private String memberLevelName;

    public PmsMemberPrice(Long id, Long productId, Long memberLevelId, BigDecimal memberPrice, String memberLevelName) {
        this.id = id;
        this.productId = productId;
        this.memberLevelId = memberLevelId;
        this.memberPrice = memberPrice;
        this.memberLevelName = memberLevelName;
    }

    public PmsMemberPrice() {
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

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
    }
}