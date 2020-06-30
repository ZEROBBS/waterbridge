package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysRole")
@Data
public class SysRole {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String encode;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fullname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer datastatus;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date createtime;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String createuserid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String permissions;
}