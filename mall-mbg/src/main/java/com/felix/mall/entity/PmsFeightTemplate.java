package com.felix.mall.entity;

import java.math.BigDecimal;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_feight_template
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class PmsFeightTemplate {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    private Integer chargeType;

    /**
     * 首重kg
     */
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    private BigDecimal firstFee;

    /**
     * 
     */
    private BigDecimal continueWeight;

    /**
     * 
     */
    private BigDecimal continmeFee;

    /**
     * 目的地（省、市）
     */
    private String dest;

    public PmsFeightTemplate(Long id, String name, Integer chargeType, BigDecimal firstWeight, BigDecimal firstFee, BigDecimal continueWeight, BigDecimal continmeFee, String dest) {
        this.id = id;
        this.name = name;
        this.chargeType = chargeType;
        this.firstWeight = firstWeight;
        this.firstFee = firstFee;
        this.continueWeight = continueWeight;
        this.continmeFee = continmeFee;
        this.dest = dest;
    }

    public PmsFeightTemplate() {
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

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    public BigDecimal getFirstFee() {
        return firstFee;
    }

    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }
}