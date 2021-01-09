package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : oms_order_setting
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class OmsOrderSetting {
    /**
     * 
     */
    private Long id;

    /**
     * 秒杀订单超时关闭时间(分)
     */
    private Integer flashOrderOvertime;

    /**
     * 正常订单超时时间(分)
     */
    private Integer normalOrderOvertime;

    /**
     * 发货后自动确认收货时间（天）
     */
    private Integer confirmOvertime;

    /**
     * 自动完成交易时间，不能申请售后（天）
     */
    private Integer finishOvertime;

    /**
     * 订单完成后自动好评时间（天）
     */
    private Integer commentOvertime;

    public OmsOrderSetting(Long id, Integer flashOrderOvertime, Integer normalOrderOvertime, Integer confirmOvertime, Integer finishOvertime, Integer commentOvertime) {
        this.id = id;
        this.flashOrderOvertime = flashOrderOvertime;
        this.normalOrderOvertime = normalOrderOvertime;
        this.confirmOvertime = confirmOvertime;
        this.finishOvertime = finishOvertime;
        this.commentOvertime = commentOvertime;
    }

    public OmsOrderSetting() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }
}