package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtWallet")
@Data
public class LtWallet {
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
}