package com.felix.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author Felix
 * @packageName com.felix.mall.dto
 * @className UpdateAdminPasswordDTO
 * @description 修改用户名密码参数
 * @date 2021/1/30 16:07
 */
@Data
public class UpdateAdminPasswordDTO {

    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "老密码", required = true)
    @NotEmpty(message = "老密码不能为空")
    private String oldPassword;

    @ApiModelProperty(value = "新密码", required = true)
    @NotEmpty(message = "新密码不能为空")
    private String newPassword;
}
