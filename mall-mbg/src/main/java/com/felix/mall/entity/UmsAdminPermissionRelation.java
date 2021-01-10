package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_admin_permission_relation
 * @author Felix
 * @date 2021-01-10 21:47:13
 */
public class UmsAdminPermissionRelation {
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
    private Long permissionId;

    /**
     * 
     */
    private Integer type;

    public UmsAdminPermissionRelation(Long id, Long adminId, Long permissionId, Integer type) {
        this.id = id;
        this.adminId = adminId;
        this.permissionId = permissionId;
        this.type = type;
    }

    public UmsAdminPermissionRelation() {
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

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}