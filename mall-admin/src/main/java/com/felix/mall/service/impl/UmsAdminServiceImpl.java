package com.felix.mall.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.felix.mall.dao.UmsAdminPermissionRelationDAO;
import com.felix.mall.dao.UmsAdminRoleRelationDAO;
import com.felix.mall.dto.UpdateAdminPasswordDTO;
import com.felix.mall.enums.UmsAdminStatusCode;
import com.felix.mall.mbg.entity.*;
import com.felix.mall.mbg.mapper.UmsAdminLoginLogMapper;
import com.felix.mall.mbg.mapper.UmsAdminMapper;
import com.felix.mall.mbg.mapper.UmsAdminPermissionRelationMapper;
import com.felix.mall.mbg.mapper.UmsAdminRoleRelationMapper;
import com.felix.mall.security.util.JWTTokenUtil;
import com.felix.mall.service.UmsAdminCacheService;
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
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    @Resource
    private JWTTokenUtil jwtTokenUtil;

    /**
     * 密码编码解码类
     */
    @Resource
    private PasswordEncoder passwordEncoder;

    /**
     * UmsAdminMapper
     */
    @Resource
    private UmsAdminMapper adminMapper;

    /**
     * 获取用户权限
     */
    @Resource
    private UmsAdminRoleRelationDAO adminRoleRelationDao;

    /**
     * 后台用户和权限关系表
     */
    @Resource
    private UmsAdminPermissionRelationMapper adminPermissionRelationMapper;

    /**
     * 登录日志
     */
    @Resource
    private UmsAdminLoginLogMapper loginLogMapper;

    @Autowired
    private UmsAdminRoleRelationMapper adminRoleRelationMapper;

    @Autowired
    private UmsAdminPermissionRelationDAO adminPermissionRelationDao;

    @Autowired
    private UmsAdminCacheService adminCacheService;


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
    public String refreshToken(String oldToken) {
        return null;
    }

    @Override
    public UmsAdmin getItem(Long id) {
        return null;
    }

    @Override
    public List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int update(Long id, UmsAdmin umsAdmin) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int updateRole(Long adminId, List<Long> roleId) {
        return 0;
    }

    @Override
    public List<UmsRole> getRoleList(Long adminId) {
        return null;
    }

    @Override
    public List<UmsResource> getResourceList(Long adminId) {
        return null;
    }

    @Override
    public int updatePermission(Long adminId, List<Long> permissionIds) {
        return 0;
    }

    @Override
    public int updatePassword(UpdateAdminPasswordDTO updateAdminPasswordDTO) {
        return 0;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return adminRoleRelationDao.getPermissionList(adminId);
    }
}
