package com.felix.mall.service.impl;

import com.felix.mall.dao.UmsAdminRoleRelationDao;
import com.felix.mall.entity.UmsAdmin;
import com.felix.mall.entity.UmsPermission;
import com.felix.mall.mapper.UmsAdminMapper;
import com.felix.mall.security.util.JWTTokenUtil;
import com.felix.mall.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


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

    /**
     * Security的UserDetailsService
     */
    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * 生成和解析Jwt Token的工具类
     */
    @Autowired
    private JWTTokenUtil jwtTokenUtil;

    /**
     * 密码编码解码类
     */
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * UmsAdminMapper
     */
    @Autowired
    private UmsAdminMapper adminMapper;

    /**
     * 获取用户权限
     */
    @Autowired
    private UmsAdminRoleRelationDao adminRoleRelationDao;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdmin umsAdmin = new UmsAdmin();

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
