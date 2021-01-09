package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_flash_promotion_log
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class SmsFlashPromotionLog {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer memberId;

    /**
     * 
     */
    private Long productId;

    /**
     * 
     */
    private String memberPhone;

    /**
     * 
     */
    private String productName;

    /**
     * 会员订阅时间
     */
    private Date subscribeTime;

    /**
     * 
     */
    private Date sendTime;

    public SmsFlashPromotionLog(Integer id, Integer memberId, Long productId, String memberPhone, String productName, Date subscribeTime, Date sendTime) {
        this.id = id;
        this.memberId = memberId;
        this.productId = productId;
        this.memberPhone = memberPhone;
        this.productName = productName;
        this.subscribeTime = subscribeTime;
        this.sendTime = sendTime;
    }

    public SmsFlashPromotionLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Date getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}