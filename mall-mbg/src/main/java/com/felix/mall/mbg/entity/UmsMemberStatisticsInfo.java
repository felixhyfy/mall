package com.felix.mall.mbg.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_member_statistics_info
 * @author Felix
 * @date 2021-01-14 21:14:09
 */
public class UmsMemberStatisticsInfo {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 累计消费金额
     */
    private BigDecimal consumeAmount;

    /**
     * 订单数量
     */
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    private Integer couponCount;

    /**
     * 评价数
     */
    private Integer commentCount;

    /**
     * 退货数量
     */
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 关注数量
     */
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    private Integer fansCount;

    /**
     * 
     */
    private Integer collectProductCount;

    /**
     * 
     */
    private Integer collectSubjectCount;

    /**
     * 
     */
    private Integer collectTopicCount;

    /**
     * 
     */
    private Integer collectCommentCount;

    /**
     * 
     */
    private Integer inviteFriendCount;

    /**
     * 最后一次下订单时间
     */
    private Date recentOrderTime;

    public UmsMemberStatisticsInfo(Long id, Long memberId, BigDecimal consumeAmount, Integer orderCount, Integer couponCount, Integer commentCount, Integer returnOrderCount, Integer loginCount, Integer attendCount, Integer fansCount, Integer collectProductCount, Integer collectSubjectCount, Integer collectTopicCount, Integer collectCommentCount, Integer inviteFriendCount, Date recentOrderTime) {
        this.id = id;
        this.memberId = memberId;
        this.consumeAmount = consumeAmount;
        this.orderCount = orderCount;
        this.couponCount = couponCount;
        this.commentCount = commentCount;
        this.returnOrderCount = returnOrderCount;
        this.loginCount = loginCount;
        this.attendCount = attendCount;
        this.fansCount = fansCount;
        this.collectProductCount = collectProductCount;
        this.collectSubjectCount = collectSubjectCount;
        this.collectTopicCount = collectTopicCount;
        this.collectCommentCount = collectCommentCount;
        this.inviteFriendCount = inviteFriendCount;
        this.recentOrderTime = recentOrderTime;
    }

    public UmsMemberStatisticsInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }
}