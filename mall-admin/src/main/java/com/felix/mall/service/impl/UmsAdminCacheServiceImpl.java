package com.felix.mall.service.impl;

import com.felix.mall.mbg.entity.UmsAdmin;
import com.felix.mall.mbg.entity.UmsResource;
import com.felix.mall.service.UmsAdminCacheService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.service.impl
 * @className UmsAdminCacheServiceImpl
 * @description 后台用户缓存操作类 实现
 * @date 2021/1/30 16:23
 */
@Service
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {

    @Override
    public void deleteAdmin(Long adminId) {

    }

    @Override
    public void deleteResourceList(Long adminId) {

    }

    @Override
    public void deleteResourceListByRole(Long roleId) {

    }

    @Override
    public void deleteResourceListByIds(List<Long> roleIds) {

    }

    @Override
    public void deleteResourceListByResource(Long resourceId) {

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
