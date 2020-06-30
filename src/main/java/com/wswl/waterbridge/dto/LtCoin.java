package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtCoin")
@Data
public class LtCoin {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String guid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer assetId;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer coinType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer chainType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal withdrawMin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal withdrawFee;

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