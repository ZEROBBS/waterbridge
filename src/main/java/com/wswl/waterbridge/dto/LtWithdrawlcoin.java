package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtWithdrawlcoin")
@Data
public class LtWithdrawlcoin {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer asset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer cid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cName;

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
    private Integer del;
}