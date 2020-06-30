package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtAssetprice")
@Data
public class LtAssetprice {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String baseAsset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String quoteAsset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal price;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;
}