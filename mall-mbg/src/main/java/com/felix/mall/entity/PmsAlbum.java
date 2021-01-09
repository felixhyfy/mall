package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_album
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class PmsAlbum {
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
    private String coverPic;

    /**
     * 
     */
    private Integer picCount;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private String description;

    public PmsAlbum(Long id, String name, String coverPic, Integer picCount, Integer sort, String description) {
        this.id = id;
        this.name = name;
        this.coverPic = coverPic;
        this.picCount = picCount;
        this.sort = sort;
        this.description = description;
    }

    public PmsAlbum() {
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

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic == null ? null : coverPic.trim();
    }

    public Integer getPicCount() {
        return picCount;
    }

    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}