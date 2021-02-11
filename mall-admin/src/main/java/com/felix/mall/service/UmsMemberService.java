package com.felix.mall.service;

import com.felix.mall.response.CommonResult;

/**
 * @author Felix
 * @packageName com.felix.mall.service
 * @className UmsMemberService
 * @description 会员管理Service
 * @date 2021/1/30 13:40
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
