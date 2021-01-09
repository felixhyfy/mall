package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_integration_consume_setting
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class UmsIntegrationConsumeSetting {
    /**
     * 
     */
    private Long id;

    /**
     * 每一元需要抵扣的积分数量
     */
    private Integer deductionPerAmount;

    /**
     * 每笔订单最高抵用百分比
     */
    private Integer maxPercentPerOrder;

    /**
     * 每次使用积分最小单位100
     */
    private Integer useUnit;

    /**
     * 是否可以和优惠券同用；0->不可以；1->可以
     */
    private Integer couponStatus;

    public UmsIntegrationConsumeSetting(Long id, Integer deductionPerAmount, Integer maxPercentPerOrder, Integer useUnit, Integer couponStatus) {
        this.id = id;
        this.deductionPerAmount = deductionPerAmount;
        this.maxPercentPerOrder = maxPercentPerOrder;
        this.useUnit = useUnit;
        this.couponStatus = couponStatus;
    }

    public UmsIntegrationConsumeSetting() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    public Integer getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }
}