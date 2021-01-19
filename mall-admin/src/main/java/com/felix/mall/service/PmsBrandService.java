package com.felix.mall.service;

import com.felix.mall.mbg.entity.PmsBrand;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.service
 * @className PmsBrandService
 * @description 商品品牌管理service接口
 * @date 2021/1/19 21:45
 */
public interface PmsBrandService {

    /**
     * 所有品牌列表
     * @return
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     * @param pmsBrand
     * @return
     */
    int createBrand(PmsBrand pmsBrand);

    /**
     * 更新品牌
     * @param id
     * @param pmsBrand
     * @return
     */
    int updateBrand(Long id, PmsBrand pmsBrand);

    /**
     * 删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 分页展示品牌
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsBrand> listBrand(int pageNum, int pageSize);

    /**
     * 查询品牌
     * @param id
     * @return
     */
    PmsBrand getBrand(Long id);
}
