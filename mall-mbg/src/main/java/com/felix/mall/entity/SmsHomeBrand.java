package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_home_brand
 * @author Felix
 * @date 2021-01-10 21:47:13
 */
public class SmsHomeBrand {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long brandId;

    /**
     * 
     */
    private String brandName;

    /**
     * 
     */
    private Integer recommendStatus;

    /**
     * 
     */
    private Integer sort;

    public SmsHomeBrand(Long id, Long brandId, String brandName, Integer recommendStatus, Integer sort) {
        this.id = id;
        this.brandId = brandId;
        this.brandName = brandName;
        this.recommendStatus = recommendStatus;
        this.sort = sort;
    }

    public SmsHomeBrand() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}