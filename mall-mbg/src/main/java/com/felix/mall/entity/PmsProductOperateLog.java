package com.felix.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_product_operate_log
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class PmsProductOperateLog {
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
    private BigDecimal priceOld;

    /**
     * 
     */
    private BigDecimal priceNew;

    /**
     * 
     */
    private BigDecimal salePriceOld;

    /**
     * 
     */
    private BigDecimal salePriceNew;

    /**
     * 赠送的积分
     */
    private Integer giftPointOld;

    /**
     * 
     */
    private Integer giftPointNew;

    /**
     * 
     */
    private Integer usePointLimitOld;

    /**
     * 
     */
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    private String operateMan;

    /**
     * 
     */
    private Date createTime;

    public PmsProductOperateLog(Long id, Long productId, BigDecimal priceOld, BigDecimal priceNew, BigDecimal salePriceOld, BigDecimal salePriceNew, Integer giftPointOld, Integer giftPointNew, Integer usePointLimitOld, Integer usePointLimitNew, String operateMan, Date createTime) {
        this.id = id;
        this.productId = productId;
        this.priceOld = priceOld;
        this.priceNew = priceNew;
        this.salePriceOld = salePriceOld;
        this.salePriceNew = salePriceNew;
        this.giftPointOld = giftPointOld;
        this.giftPointNew = giftPointNew;
        this.usePointLimitOld = usePointLimitOld;
        this.usePointLimitNew = usePointLimitNew;
        this.operateMan = operateMan;
        this.createTime = createTime;
    }

    public PmsProductOperateLog() {
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

    public BigDecimal getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    public BigDecimal getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}