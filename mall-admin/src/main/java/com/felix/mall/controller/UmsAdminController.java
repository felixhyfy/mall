package com.felix.mall.controller;

import com.felix.mall.dto.UmsAdminLoginDTO;
import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsPermission;
import com.felix.mall.response.CommonResponse;
import com.felix.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Felix
 * @packageName com.felix.mall.controller
 * @className UmsAdminController
 * @description 后台用户管理接口
 * @date 2021/1/10 21:10
 */
@Controller
@Slf4j
@Api(tags = "UmsAdminController", description = "后台用户管理接口")
@RequestMapping("/admin")
public class UmsAdminController {

    @Autowired
    private UmsAdminService adminService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResponse<UmsAdmin> register(@RequestBody UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (null == umsAdmin) {
            log.info("注册失败, umsAdminParam: {}", umsAdminParam);
            return CommonResponse.failed();
        }
        //注册成功
        log.info("注册成功, umsAdmin: {}", umsAdmin);
        return CommonResponse.success(umsAdmin);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResponse login(@RequestBody UmsAdminLoginDTO umsAdminLoginDTO,
                                BindingResult result) {
        //获得token
        String token = adminService.login(umsAdminLoginDTO.getUsername(), umsAdminLoginDTO.getPassword());
        if (null == token) {
            return CommonResponse.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResponse.success(tokenMap);
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResponse<List<UmsPermission>> getPermissionList(@PathVariable Long adminId) {
        List<UmsPermission> permissionList = adminService.getPermissionList(adminId);
        log.info("{}的权限为：{}", adminId, permissionList);
        return CommonResponse.success(permissionList);
    }
}
