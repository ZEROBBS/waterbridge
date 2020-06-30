package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtAsset")
@Data
public class LtAsset {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String assetName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer assetType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer totalFlag;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer eFlag;

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
    private BigDecimal exchangeMin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String icon;
}