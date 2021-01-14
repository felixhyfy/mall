package com.felix.mall.mbg.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : sms_home_recommend_subject
 * @author Felix
 * @date 2021-01-14 21:14:09
 */
public class SmsHomeRecommendSubject {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long subjectId;

    /**
     * 
     */
    private String subjectName;

    /**
     * 
     */
    private Integer recommendStatus;

    /**
     * 
     */
    private Integer sort;

    public SmsHomeRecommendSubject(Long id, Long subjectId, String subjectName, Integer recommendStatus, Integer sort) {
        this.id = id;
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.recommendStatus = recommendStatus;
        this.sort = sort;
    }

    public SmsHomeRecommendSubject() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
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