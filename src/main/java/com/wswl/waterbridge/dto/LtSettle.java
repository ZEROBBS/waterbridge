package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtSettle")
@Data
public class LtSettle {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String batch;

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
    private BigDecimal issuePrice;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer flag;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long begin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long end;
}