package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LeProduct")
@Data
public class LeProduct {
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
    private Integer lType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String lName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cnName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer pAssetId;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer pCoinId;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String pledge;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String loanAsset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal pledgeRatio;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal cRatio;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer expire;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;
}