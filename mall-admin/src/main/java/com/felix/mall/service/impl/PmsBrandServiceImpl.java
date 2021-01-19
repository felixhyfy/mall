package com.felix.mall.service.impl;

import com.felix.mall.mbg.entity.PmsBrand;
import com.felix.mall.mbg.entity.PmsBrandExample;
import com.felix.mall.mbg.mapper.PmsBrandMapper;
import com.felix.mall.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.service.impl
 * @className PmsBrandServiceImpl
 * @description 品牌管理service实现类
 * @date 2021/1/19 21:49
 */
@Service
@Slf4j
public class PmsBrandServiceImpl implements PmsBrandService {

    @Resource
    PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand pmsBrand) {
        //传入可变参数
        return brandMapper.insertSelective(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand pmsBrand) {
        pmsBrand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
