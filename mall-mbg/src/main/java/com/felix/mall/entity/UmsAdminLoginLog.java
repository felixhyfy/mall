package com.felix.mall.entity;

import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_admin_login_log
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class UmsAdminLoginLog {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long adminId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String ip;

    /**
     * 
     */
    private String address;

    /**
     * 浏览器登录类型
     */
    private String userAgent;

    public UmsAdminLoginLog(Long id, Long adminId, Date createTime, String ip, String address, String userAgent) {
        this.id = id;
        this.adminId = adminId;
        this.createTime = createTime;
        this.ip = ip;
        this.address = address;
        this.userAgent = userAgent;
    }

    public UmsAdminLoginLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }
}