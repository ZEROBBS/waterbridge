package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysSmsTemplate")
@Data
public class SysSmsTemplate {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 模板名称+CN/EN
    */
    @ApiModelProperty(value="模板名称+CN/EN")
    private String templatename;

    /**
    * 签名
    */
    @ApiModelProperty(value="签名")
    private String signname;

    /**
    * 模板内容
    */
    @ApiModelProperty(value="模板内容")
    private String context;

    /**
    * 模板编号
    */
    @ApiModelProperty(value="模板编号")
    private String templatecode;

    /**
    * 限制次数
    */
    @ApiModelProperty(value="限制次数")
    private Integer limitcount;

    /**
    * 限制分钟
    */
    @ApiModelProperty(value="限制分钟")
    private Integer limittime;
}