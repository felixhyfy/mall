package com.felix.mall.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.felix.mall.dao.UmsAdminRoleRelationDao;
import com.felix.mall.entity.UmsAdmin;
import com.felix.mall.entity.UmsAdminExample;
import com.felix.mall.entity.UmsPermission;
import com.felix.mall.enums.UmsAdminStatusCode;
import com.felix.mall.mapper.UmsAdminMapper;
import com.felix.mall.security.util.JWTTokenUtil;
import com.felix.mall.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        UmsAdminExample example = new UmsAdminExample();
        //根据username找对应记录
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (null != adminList && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        //将数据复制
        BeanUtil.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(UmsAdminStatusCode.ON.getCode());
        //查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            //已经注册
            return null;
        }
        //没有注册，将密码进行加密
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        //更新UmsAdmin数据库
        //todo:这里应该要有更新失败的异常处理逻辑
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }

    @Override
    public String login(String username, String password) {
        //使用token
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            //编码，比对
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                //密码不正确
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,
                    null,
                    userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常：{}", e.getMessage());
        }
        return token;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return adminRoleRelationDao.getPermissionList(adminId);
    }
}
