package com.felix.mall.mbg.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_product_vertify_record
 * @author Felix
 * @date 2021-01-14 21:14:09
 */
public class PmsProductVertifyRecord {
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
    private Date createTime;

    /**
     * 审核人
     */
    private String vertifyMan;

    /**
     * 
     */
    private Integer status;

    /**
     * 反馈详情
     */
    private String detail;

    public PmsProductVertifyRecord(Long id, Long productId, Date createTime, String vertifyMan, Integer status, String detail) {
        this.id = id;
        this.productId = productId;
        this.createTime = createTime;
        this.vertifyMan = vertifyMan;
        this.status = status;
        this.detail = detail;
    }

    public PmsProductVertifyRecord() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVertifyMan() {
        return vertifyMan;
    }

    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan == null ? null : vertifyMan.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}