package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_flash_promotion_session
 * @author Felix
 * @date 2021-01-10 21:47:13
 */
public class SmsFlashPromotionSession {
    /**
     * 编号
     */
    private Long id;

    /**
     * 场次名称
     */
    private String name;

    /**
     * 每日开始时间
     */
    private Date startTime;

    /**
     * 每日结束时间
     */
    private Date endTime;

    /**
     * 启用状态：0->不启用；1->启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    public SmsFlashPromotionSession(Long id, String name, Date startTime, Date endTime, Integer status, Date createTime) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.createTime = createTime;
    }

    public SmsFlashPromotionSession() {
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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