package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_admin_role_relation
 * @author Felix
 * @date 2021-01-09 21:27:00
 */
public class UmsAdminRoleRelation {
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
    private Long roleId;

    public UmsAdminRoleRelation(Long id, Long adminId, Long roleId) {
        this.id = id;
        this.adminId = adminId;
        this.roleId = roleId;
    }

    public UmsAdminRoleRelation() {
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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}