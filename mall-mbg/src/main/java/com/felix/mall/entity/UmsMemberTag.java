package com.felix.mall.entity;

import java.math.BigDecimal;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_member_tag
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class UmsMemberTag {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 自动打标签完成订单数量
     */
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    private BigDecimal finishOrderAmount;

    public UmsMemberTag(Long id, String name, Integer finishOrderCount, BigDecimal finishOrderAmount) {
        this.id = id;
        this.name = name;
        this.finishOrderCount = finishOrderCount;
        this.finishOrderAmount = finishOrderAmount;
    }

    public UmsMemberTag() {
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

    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }
}