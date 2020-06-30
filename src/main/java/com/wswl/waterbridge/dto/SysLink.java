package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysLink")
@Data
public class SysLink {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fvalue;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String language;
}