package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : cms_prefrence_area
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class CmsPrefrenceArea {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String subTitle;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 展示图片
     */
    private byte[] pic;

    public CmsPrefrenceArea(Long id, String name, String subTitle, Integer sort, Integer showStatus) {
        this.id = id;
        this.name = name;
        this.subTitle = subTitle;
        this.sort = sort;
        this.showStatus = showStatus;
    }

    public CmsPrefrenceArea(Long id, String name, String subTitle, Integer sort, Integer showStatus, byte[] pic) {
        this.id = id;
        this.name = name;
        this.subTitle = subTitle;
        this.sort = sort;
        this.showStatus = showStatus;
        this.pic = pic;
    }

    public CmsPrefrenceArea() {
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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}