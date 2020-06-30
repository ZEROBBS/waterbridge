package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtRecommenddapp")
@Data
public class LtRecommenddapp {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer did;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cnName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String enName;

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

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}