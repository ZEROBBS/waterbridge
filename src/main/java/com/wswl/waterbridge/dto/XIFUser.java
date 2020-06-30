package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.XIFUser")
@Data
public class XIFUser {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer userId;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String coin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String mobile;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String username;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String address;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer father;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fathermobile;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String sysflag;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String sysdatetime;
}