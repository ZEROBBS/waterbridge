package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysExchangeRate")
@Data
public class SysExchangeRate {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 币种简称
    */
    @ApiModelProperty(value="币种简称")
    private String currency;

    /**
    * 汇率（基数为美元）
    */
    @ApiModelProperty(value="汇率（基数为美元）")
    private BigDecimal exchangerate;

    /**
    * 最近一次更新时间
    */
    @ApiModelProperty(value="最近一次更新时间")
    private Date updatetime;

    /**
    * 币种说明
    */
    @ApiModelProperty(value="币种说明")
    private String currencymemo;
}