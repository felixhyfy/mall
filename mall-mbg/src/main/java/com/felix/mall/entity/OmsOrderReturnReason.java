package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : oms_order_return_reason
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class OmsOrderReturnReason {
    /**
     * 
     */
    private Long id;

    /**
     * 退货类型
     */
    private String name;

    /**
     * 
     */
    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     */
    private Integer status;

    /**
     * 添加时间
     */
    private Date createTime;

    public OmsOrderReturnReason(Long id, String name, Integer sort, Integer status, Date createTime) {
        this.id = id;
        this.name = name;
        this.sort = sort;
        this.status = status;
        this.createTime = createTime;
    }

    public OmsOrderReturnReason() {
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}