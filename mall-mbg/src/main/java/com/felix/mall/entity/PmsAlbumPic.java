package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : pms_album_pic
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class PmsAlbumPic {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long albumId;

    /**
     * 
     */
    private String pic;

    public PmsAlbumPic(Long id, Long albumId, String pic) {
        this.id = id;
        this.albumId = albumId;
        this.pic = pic;
    }

    public PmsAlbumPic() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}