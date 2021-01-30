package com.felix.mall.controller;

import com.felix.mall.response.CommonResponse;
import com.felix.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Felix
 * @packageName com.felix.mall.controller
 * @className UmsMemberController
 * @description 会员登录注册管理controller
 * @date 2021/1/30 14:58
 */
@Controller
@Slf4j
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {

    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResponse getAuthCode(@RequestParam String telephone) {
        log.info("获取验证码，telephone={}", telephone);
        return memberService.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResponse verifyAuthCode(@RequestParam String telephone,
                                         @RequestParam String authCode) {
        log.info("进行验证码校验, telephone={}, authCode={}", telephone, authCode);
        return memberService.verifyAuthCode(telephone, authCode);
    }

}
