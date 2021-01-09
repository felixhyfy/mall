package com.felix.mall.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : oms_order_return_apply
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class OmsOrderReturnApply {
    /**
     * 
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 收货地址表id
     */
    private Long companyAddressId;

    /**
     * 退货商品id
     */
    private Long productId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 申请时间
     */
    private Date createTime;

    /**
     * 会员用户名
     */
    private String memberUsername;

    /**
     * 退款金额
     */
    private BigDecimal returnAmount;

    /**
     * 退货人姓名
     */
    private String returnName;

    /**
     * 退货人电话
     */
    private String returnPhone;

    /**
     * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
     */
    private Integer status;

    /**
     * 处理时间
     */
    private Date handleTime;

    /**
     * 商品图片
     */
    private String productPic;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品品牌
     */
    private String productBrand;

    /**
     * 商品销售属性：颜色：红色；尺码：xl;
     */
    private String productAttr;

    /**
     * 退货数量
     */
    private Integer productCount;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品实际支付单价
     */
    private BigDecimal productRealPrice;

    /**
     * 原因
     */
    private String reason;

    /**
     * 描述
     */
    private String description;

    /**
     * 凭证图片，以逗号隔开
     */
    private String proofPics;

    /**
     * 处理备注
     */
    private String handleNote;

    /**
     * 处理人员
     */
    private String handleMan;

    /**
     * 收货人
     */
    private String receiveMan;

    /**
     * 收货时间
     */
    private Date receiveTime;

    /**
     * 收货备注
     */
    private String receiveNote;

    public OmsOrderReturnApply(Long id, Long orderId, Long companyAddressId, Long productId, String orderSn, Date createTime, String memberUsername, BigDecimal returnAmount, String returnName, String returnPhone, Integer status, Date handleTime, String productPic, String productName, String productBrand, String productAttr, Integer productCount, BigDecimal productPrice, BigDecimal productRealPrice, String reason, String description, String proofPics, String handleNote, String handleMan, String receiveMan, Date receiveTime, String receiveNote) {
        this.id = id;
        this.orderId = orderId;
        this.companyAddressId = companyAddressId;
        this.productId = productId;
        this.orderSn = orderSn;
        this.createTime = createTime;
        this.memberUsername = memberUsername;
        this.returnAmount = returnAmount;
        this.returnName = returnName;
        this.returnPhone = returnPhone;
        this.status = status;
        this.handleTime = handleTime;
        this.productPic = productPic;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productAttr = productAttr;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.productRealPrice = productRealPrice;
        this.reason = reason;
        this.description = description;
        this.proofPics = proofPics;
        this.handleNote = handleNote;
        this.handleMan = handleMan;
        this.receiveMan = receiveMan;
        this.receiveTime = receiveTime;
        this.receiveNote = receiveNote;
    }

    public OmsOrderReturnApply() {
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

    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName == null ? null : returnName.trim();
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone == null ? null : returnPhone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr == null ? null : productAttr.trim();
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics == null ? null : proofPics.trim();
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote == null ? null : handleNote.trim();
    }

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan == null ? null : handleMan.trim();
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan == null ? null : receiveMan.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote == null ? null : receiveNote.trim();
    }
}