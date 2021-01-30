package com.felix.mall.service.impl;

import com.felix.mall.response.CommonResponse;
import com.felix.mall.service.RedisService;
import com.felix.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @author Felix
 * @packageName com.felix.mall.service.impl
 * @className UmsMemberServiceImpl
 * @description 会员管理Service实现类
 * @date 2021/1/30 13:43
 */
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private RedisService redisService;

    @Value("redis.key.prefix.authCode")
    private String REDIS_KEY_PREFIX_AUTH_CODE;

    @Value("redis.key.expire.authCode")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public CommonResponse generateAuthCode(String telephone) {
        //生成验证码
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        //验证码绑定手机号并存储到Redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
        //设置过期时间
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return CommonResponse.success(sb.toString(), "获取验证码成功");
    }

    @Override
    public CommonResponse verifyAuthCode(String telephone, String authCode) {
        //先判断authCode是否为空，为空直接返回失败
        if (StringUtils.isEmpty(authCode)) {
            return CommonResponse.failed("请输入验证码");
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        if (authCode.equals(realAuthCode)) {
            //校验成功
            return CommonResponse.success(null, "验证码校验成功");
        }
        return CommonResponse.failed("验证码不正确");
    }
}
