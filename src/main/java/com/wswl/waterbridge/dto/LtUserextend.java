package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtUserextend")
@Data
public class LtUserextend {
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
    private Integer parent;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal weekAward;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal totalAward;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal totalAwardUsd;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal totalConsume;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal totalLimit;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal totalPower;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal totalContribu;
}