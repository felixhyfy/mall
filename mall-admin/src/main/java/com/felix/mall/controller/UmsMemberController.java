package com.felix.mall.controller;

import com.felix.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Felix
 * @packageName com.felix.mall.controller
 * @className UmsMemberController
 * @description 会员登录注册管理controller
 * @date 2021/1/30 14:58
 */
@Controller
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {

    @Autowired
    private UmsMemberService umsMemberService;

}
