package com.felix.mall.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_role_permission_relation
 * @author Felix
 * @date 2021-01-09 21:05:55
 */
public class UmsRolePermissionRelation {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long roleId;

    /**
     * 
     */
    private Long permissionId;

    public UmsRolePermissionRelation(Long id, Long roleId, Long permissionId) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public UmsRolePermissionRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}