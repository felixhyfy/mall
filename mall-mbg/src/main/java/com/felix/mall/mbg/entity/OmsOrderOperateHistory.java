package com.felix.mall.mbg.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : oms_order_operate_history
 * @author Felix
 * @date 2021-01-14 21:14:09
 */
public class OmsOrderOperateHistory {
    /**
     * 
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 操作人：用户；系统；后台管理员
     */
    private String operateMan;

    /**
     * 操作时间
     */
    private Date createTime;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer orderStatus;

    /**
     * 备注
     */
    private String note;

    public OmsOrderOperateHistory(Long id, Long orderId, String operateMan, Date createTime, Integer orderStatus, String note) {
        this.id = id;
        this.orderId = orderId;
        this.operateMan = operateMan;
        this.createTime = createTime;
        this.orderStatus = orderStatus;
        this.note = note;
    }

    public OmsOrderOperateHistory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}