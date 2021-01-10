package com.felix.mall.service.impl;

import com.felix.mall.entity.UmsAdmin;
import com.felix.mall.entity.UmsPermission;
import com.felix.mall.service.UmsAdminService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Felix
 * @packageName com.felix.mall.service.impl
 * @className UmsAdminServiceImpl
 * @description UmsAdminService实现类
 * @date 2021/1/10 19:54
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return null;
    }
}
