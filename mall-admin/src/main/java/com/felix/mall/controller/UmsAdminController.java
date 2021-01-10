package com.felix.mall.controller;

import com.felix.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Felix
 * @packageName com.felix.mall.controller
 * @className UmsAdminController
 * @description 后台用户管理接口
 * @date 2021/1/10 21:10
 */
@Controller
@Api(tags = "UmsAdminController", description = "后台用户管理接口")
@RequestMapping("/admin")
public class UmsAdminController {

    @Autowired
    private UmsAdminService adminService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;


}
