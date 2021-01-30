package com.felix.mall.controller;

import com.felix.mall.mbg.entity.PmsBrand;
import com.felix.mall.response.CommonPage;
import com.felix.mall.response.CommonResponse;
import com.felix.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall.controller
 * @className PmsBrandController
 * @description 品牌管理
 * @date 2021/1/19 21:43
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@Controller
@RequestMapping("/brand")
@Slf4j
public class PmsBrandController {

    @Autowired
    PmsBrandService pmsBrandService;

    @ApiOperation(value = "获取全部品牌列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResponse<List<PmsBrand>> getList() {
        return CommonResponse.success(pmsBrandService.listAllBrand());
    }

    @ApiOperation(value = "添加品牌")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResponse create(@RequestBody PmsBrand pmsBrand) {
        CommonResponse response;
        int count = pmsBrandService.createBrand(pmsBrand);
        if (count == 1) {
            log.info("添加品牌成功，{}", pmsBrand);
            response = CommonResponse.success(pmsBrand);
        } else {
            log.info("添加品牌失败，{}", pmsBrand);
            response =  CommonResponse.failed("操作失败");
        }
        return response;
    }

    @ApiOperation("更新指定id品牌信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:update')")
    public CommonResponse updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrand pmsBrand) {
        CommonResponse response;
        int count = pmsBrandService.updateBrand(id, pmsBrand);
        if (count == 1) {
            log.info("更新品牌成功，{}", pmsBrand);
            response = CommonResponse.success(pmsBrand);
        } else {
            log.info("更新品牌失败，{}", pmsBrand);
            response =  CommonResponse.failed("操作失败");
        }
        return response;
    }

    @ApiOperation("删除指定id的品牌")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:delete')")
    public CommonResponse deleteBrand(@PathVariable("id") Long id) {
        int count = pmsBrandService.deleteBrand(id);
        if (count == 1) {
            log.info("删除品牌成功， id={}", id);
            return CommonResponse.success(null);
        } else {
            log.info("删除品牌失败：id={}", id);
            return CommonResponse.failed("操作失败");
        }
    }

    @ApiOperation("分页查询品牌列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResponse<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1")
                                                          @ApiParam("页码") Integer pageNum,
                                                          @RequestParam(value = "pageSize", defaultValue = "3")
                                                          @ApiParam("每页数量") Integer pageSize) {
        List<PmsBrand> brandList = pmsBrandService.listBrand(pageNum, pageSize);
        return CommonResponse.success(CommonPage.restPage(brandList));
    }

    @ApiOperation("获取指定id的品牌详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResponse<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResponse.success(pmsBrandService.getBrand(id));
    }

}
