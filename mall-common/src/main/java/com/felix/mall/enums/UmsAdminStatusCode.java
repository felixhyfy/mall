package com.felix.mall.enums;

/**
 * @author Felix
 * @packageName com.felix.mall.enums
 * @className UmsAdminStatusCode
 * @description 账号启用状态
 * @date 2021/1/10 21:54
 */
public enum UmsAdminStatusCode {
    ON(1, "账号启用"),
    OFF(0, "账号禁用")
    ;

    private Integer code;
    private String desc;

    private UmsAdminStatusCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
