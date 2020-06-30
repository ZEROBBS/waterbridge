package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.OrderPayInfo")
@Data
public class OrderPayInfo {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String usersn;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String ordersn;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String dappsn;

    /**
    * 消费金额
    */
    @ApiModelProperty(value="消费金额")
    private BigDecimal totalamount;

    /**
    * 消费金额USD
    */
    @ApiModelProperty(value="消费金额USD")
    private BigDecimal totalamountusd;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal refundamount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal refundamountusd;

    /**
    * 费率
    */
    @ApiModelProperty(value="费率")
    private BigDecimal rate;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date createtime;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String currency;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String paystate;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String orderstate;
}