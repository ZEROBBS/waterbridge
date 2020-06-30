package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtAgentconfig")
@Data
public class LtAgentconfig {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

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
    private BigDecimal weekConsume;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal positionBegin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal positionEnd;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal award;
}