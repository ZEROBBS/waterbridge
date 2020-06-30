package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtCurrency")
@Data
public class LtCurrency {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cnName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String code;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String symbol;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String icon;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;
}