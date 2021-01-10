package com.felix.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_coupon
 * @author Felix
 * @date 2021-01-10 21:47:13
 */
public class SmsCoupon {
    /**
     * 
     */
    private Long id;

    /**
     * 优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
     */
    private Integer type;

    /**
     * 
     */
    private String name;

    /**
     * 使用平台：0->全部；1->移动；2->PC
     */
    private Integer platform;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 每人限领张数
     */
    private Integer perLimit;

    /**
     * 使用门槛；0表示无门槛
     */
    private BigDecimal minPoint;

    /**
     * 
     */
    private Date startTime;

    /**
     * 
     */
    private Date endTime;

    /**
     * 使用类型：0->全场通用；1->指定分类；2->指定商品
     */
    private Integer useType;

    /**
     * 备注
     */
    private String note;

    /**
     * 发行数量
     */
    private Integer publishCount;

    /**
     * 已使用数量
     */
    private Integer useCount;

    /**
     * 领取数量
     */
    private Integer receiveCount;

    /**
     * 可以领取的日期
     */
    private Date enableTime;

    /**
     * 优惠码
     */
    private String code;

    /**
     * 可领取的会员类型：0->无限时
     */
    private Integer memberLevel;

    public SmsCoupon(Long id, Integer type, String name, Integer platform, Integer count, BigDecimal amount, Integer perLimit, BigDecimal minPoint, Date startTime, Date endTime, Integer useType, String note, Integer publishCount, Integer useCount, Integer receiveCount, Date enableTime, String code, Integer memberLevel) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.platform = platform;
        this.count = count;
        this.amount = amount;
        this.perLimit = perLimit;
        this.minPoint = minPoint;
        this.startTime = startTime;
        this.endTime = endTime;
        this.useType = useType;
        this.note = note;
        this.publishCount = publishCount;
        this.useCount = useCount;
        this.receiveCount = receiveCount;
        this.enableTime = enableTime;
        this.code = code;
        this.memberLevel = memberLevel;
    }

    public SmsCoupon() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public BigDecimal getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
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

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }
}