package com.felix.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author Felix
 * @packageName com.felix.mall.dto
 * @className PmsBrandDTO
 * @description 品牌传递参数
 * @date 2021/1/19 22:01
 */
@Data
public class PmsBrandDTO {

    @ApiModelProperty(value = "品牌名称", required = true)
    @NotEmpty(message = "名称不能为空")
    private String name;

    @ApiModelProperty(value = "品牌首字母")
    private String firstLetter;

    @ApiModelProperty(value = "排序字段")
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;

    @ApiModelProperty(value = "是否为厂家制造商")
    //todo:没写完，这里需要到后面再过来重构
    private Integer factoryStatus;

    private Integer showStatus;

    private String logo;

    private String bigPic;

    private String brandStory;
}
