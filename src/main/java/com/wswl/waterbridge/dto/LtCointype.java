package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtCointype")
@Data
public class LtCointype {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String tName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer chainType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;
}