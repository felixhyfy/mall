package com.felix.mall.service;

import com.felix.mall.dto.UpdateAdminPasswordDTO;
import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsPermission;
import com.felix.mall.mbg.entity.UmsResource;
import com.felix.mall.mbg.entity.UmsRole;
import org.apache.catalina.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.service
 * @className UmsAdminService
 * @description 后台管理验证登录Service
 * @date 2021/1/10 13:27
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     *
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     *
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     *
     * @param username
     * @param password
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 刷新token
     *
     * @param oldToken
     * @return
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     *
     * @param id
     * @return
     */
    UmsAdmin getItem(Long id);

    /**
     * 根据用户名或昵称分页查询用户
     *
     * @param keyword
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用户信息
     *
     * @param id
     * @param umsAdmin
     * @return
     */
    int update(Long id, UmsAdmin umsAdmin);

    /**
     * 删除指定用户
     *
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 修改用户角色关系
     *
     * @param adminId
     * @param roleId
     * @return
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleId);

    /**
     * 获取用户对应角色
     *
     * @param adminId
     * @return
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 获取指定用户的可访问资源
     *
     * @param adminId
     * @return
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 修改用户的+-权限
     *
     * @param adminId
     * @param permissionIds
     * @return
     */
    @Transactional
    int updatePermission(Long adminId, List<Long> permissionIds);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     *
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);

    /**
     * 修改密码
     *
     * @param updateAdminPasswordDTO
     * @return
     */
    int updatePassword(UpdateAdminPasswordDTO updateAdminPasswordDTO);

    /**
     * 获取用户信息
     *
     * @param username
     * @return
     */
    UserDetails loadUserByUsername(String username);

}
