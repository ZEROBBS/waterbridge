package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LogPayRecord")
@Data
public class LogPayRecord {
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
    private String dappsn;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String tradeno;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long endtime;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer totalfee;
}