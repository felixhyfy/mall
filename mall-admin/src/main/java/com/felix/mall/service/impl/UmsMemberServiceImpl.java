package com.felix.mall.service.impl;

import com.felix.mall.response.CommonResponse;
import com.felix.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Felix
 * @packageName com.felix.mall.service.impl
 * @className UmsMemberServiceImpl
 * @description 会员管理Service实现类
 * @date 2021/1/30 13:43
 */
public class UmsMemberServiceImpl implements UmsMemberService {

    @Value("redis.key.prefix.authCode")
    private String REDIS_KEY_PREFIX_AUTH_CODE;

    @Value("redis.key.expire.authCode")
    private String AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public CommonResponse generateAuthCode(String telephone) {
        //todo:需要使用缓存保存数据
        return null;
    }

    @Override
    public CommonResponse verifyAuthCode(String telephone, String authCode) {
        return null;
    }
}
