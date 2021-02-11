package com.felix.mall.controller;

import com.felix.mall.dto.UmsAdminLoginDTO;
import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsPermission;
import com.felix.mall.response.CommonResult;
import com.felix.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
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
    public CommonResult<UmsAdmin> register(@RequestBody UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (null == umsAdmin) {
            log.info("注册失败, umsAdminParam: {}", umsAdminParam);
            return CommonResult.failed();
        }
        //注册成功
        log.info("注册成功, umsAdmin: {}", umsAdmin);
        return CommonResult.success(umsAdmin);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UmsAdminLoginDTO umsAdminLoginDTO,
                              BindingResult result) {
        //获得token
        String token = adminService.login(umsAdminLoginDTO.getUsername(), umsAdminLoginDTO.getPassword());
        if (null == token) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refreshToken", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult refreshToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String refreshToken = adminService.refreshToken(token);
        if (refreshToken == null) {
            return CommonResult.failed("token已经过期！");
        }
        //返回刷新后的token
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", refreshToken);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAdminInfo(Principal principal) {
        if (principal == null) {
            //直接返回未认证
            return CommonResult.unauthorized(null);
        }
        String username = principal.getName();
        UmsAdmin umsAdmin = adminService.getAdminByUsername(username);
        Map<String, Object> data = new HashMap<>();
        //放置当前用户的用户名、权限、菜单、Icon等一些列信息
        data.put("username", umsAdmin.getUsername());
        //todo:应该还要补充对应信息
        return null;
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsPermission>> getPermissionList(@PathVariable Long adminId) {
        List<UmsPermission> permissionList = adminService.getPermissionList(adminId);
        log.info("{}的权限为：{}", adminId, permissionList);
        return CommonResult.success(permissionList);
    }
}
