package com.felix.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author Felix
 * @packageName com.felix.mall.dto
 * @className UmsAdminLoginDTO
 * @description 用户登录参数传输对象
 * @date 2021/1/10 21:24
 */
@Data
public class UmsAdminLoginDTO {

    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
}
