package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtRecharge")
@Data
public class LtRecharge {
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
    private Integer rechargeType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String txid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String outTradeNo;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer coin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String batch;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String sender;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String receive;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal amount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}