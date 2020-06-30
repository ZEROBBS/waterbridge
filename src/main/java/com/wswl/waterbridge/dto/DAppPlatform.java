package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.DAppPlatform")
@Data
public class DAppPlatform {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 版本
    */
    @ApiModelProperty(value="版本")
    private String version;

    /**
    * 平台
    */
    @ApiModelProperty(value="平台")
    private String platform;

    /**
    * 1：苹果；2：安卓
    */
    @ApiModelProperty(value="1：苹果；2：安卓")
    private Short apptype;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String context;
}