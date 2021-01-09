package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_member_receive_address
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class UmsMemberReceiveAddress {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 收货人名称
     */
    private String name;

    /**
     * 
     */
    private String phoneNumber;

    /**
     * 是否为默认
     */
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 省份/直辖市
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址(街道)
     */
    private String detailAddress;

    public UmsMemberReceiveAddress(Long id, Long memberId, String name, String phoneNumber, Integer defaultStatus, String postCode, String province, String city, String region, String detailAddress) {
        this.id = id;
        this.memberId = memberId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.defaultStatus = defaultStatus;
        this.postCode = postCode;
        this.province = province;
        this.city = city;
        this.region = region;
        this.detailAddress = detailAddress;
    }

    public UmsMemberReceiveAddress() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }
}