package com.felix.mall.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.felix.mall.dao.UmsAdminRoleRelationDAO;
import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsAdminRoleRelation;
import com.felix.mall.mbg.entity.UmsAdminRoleRelationExample;
import com.felix.mall.mbg.entity.UmsResource;
import com.felix.mall.mbg.mapper.UmsAdminRoleRelationMapper;
import com.felix.mall.service.RedisService;
import com.felix.mall.service.UmsAdminCacheService;
import com.felix.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Felix
 * @packageName com.felix.mall.service.impl
 * @className UmsAdminCacheServiceImpl
 * @description 后台用户缓存操作类 实现
 * @date 2021/1/30 16:23
 */
@Service
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {

    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private RedisService redisService;
    @Autowired
    private UmsAdminRoleRelationMapper roleRelationMapper;
    @Autowired
    private UmsAdminRoleRelationDAO roleRelationDAO;

    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private String REDIS_EXPIRE;
    @Value("${redis.key.admin}")
    private String REDIS_KEY_ADMIN;
    @Value("${redis.key.resourceList}")
    private String REDIS_KEY_RESOURCE_LIST;

    @Override
    public void deleteAdmin(Long adminId) {
        UmsAdmin admin = adminService.getItem(adminId);
        if (null != admin) {
            String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + admin.getUsername();
            redisService.remove(key);
        }
    }

    @Override
    public void deleteResourceList(Long adminId) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_RESOURCE_LIST + ":" + adminId;
        redisService.remove(key);
    }

    @Override
    public void deleteResourceListByRole(Long roleId) {
        UmsAdminRoleRelationExample example = new UmsAdminRoleRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<UmsAdminRoleRelation> relationList = roleRelationMapper.selectByExample(example);
        if (CollUtil.isNotEmpty(relationList)) {
            String keyPrefix = REDIS_DATABASE + ":" + REDIS_KEY_RESOURCE_LIST + ":";
            List<String> keys = relationList.stream().map(relation -> keyPrefix + relation.getAdminId()).collect(Collectors.toList());
            redisService.remove(keys);
        }
    }

    @Override
    public void deleteResourceListByRoleIds(List<Long> roleIds) {
        UmsAdminRoleRelationExample example = new UmsAdminRoleRelationExample();
        example.createCriteria().andRoleIdIn(roleIds);
        List<UmsAdminRoleRelation> relationList = roleRelationMapper.selectByExample(example);
        if (CollUtil.isNotEmpty(relationList)) {
            //删除后台用户缓存
            String keyPrefix = REDIS_DATABASE + ":" + REDIS_KEY_RESOURCE_LIST + ":";
            List<String> keys = relationList.stream().map(relation -> keyPrefix + relation.getAdminId()).collect(Collectors.toList());
            redisService.remove(keys);
        }
    }

    @Override
    public void deleteResourceListByResource(Long resourceId) {
        //todo
        //需要先补充UmsAdminRoleRelationDAO
    }

    @Override
    public UmsAdmin getAdmin(String username) {
        return null;
    }

    @Override
    public void setAdmin(UmsAdmin admin) {

    }

    @Override
    public List<UmsResource> getResourceList(Long adminId) {
        return null;
    }

    @Override
    public void setResourceList(Long adminId, List<UmsResource> resourceList) {

    }
}
