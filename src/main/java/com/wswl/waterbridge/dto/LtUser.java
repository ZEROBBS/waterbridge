package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtUser")
@Data
public class LtUser {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer uid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String usn;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String phone;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String phonearea;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String username;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fullname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String icon;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String passwd;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String paywd;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer level;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer valied;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String recommend;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;


    private String msgcode;
}