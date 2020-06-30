package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtUserbalance")
@Data
public class LtUserbalance {
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
    private Integer asset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal balance;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal frozen;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal balanceUsd;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal frozenUsd;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String address;
}