package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtTranfer")
@Data
public class LtTranfer {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String orderNo;

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
    private Integer chainType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer receive;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer asset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer coin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal amount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal fee;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String txid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}