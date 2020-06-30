package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtAddress")
@Data
public class LtAddress {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

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
    private Integer chainType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String address;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;
}