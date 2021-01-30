package com.felix.mall.service.impl;

import com.felix.mall.response.CommonResponse;
import com.felix.mall.service.UmsMemberService;

/**
 * @author Felix
 * @packageName com.felix.mall.service.impl
 * @className UmsMemberServiceImpl
 * @description 会员管理Service实现类
 * @date 2021/1/30 13:43
 */
public class UmsMemberServiceImpl implements UmsMemberService {

    @Override
    public CommonResponse generateAuthCode(String telephone) {
        return null;
    }

    @Override
    public CommonResponse verifyAuthCode(String telephone, String authCode) {
        return null;
    }
}
