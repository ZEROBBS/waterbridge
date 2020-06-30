package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysSearchInfo")
@Data
public class SysSearchInfo {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String usersn;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String searchkey;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long searchcount;
}