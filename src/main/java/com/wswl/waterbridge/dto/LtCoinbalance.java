package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtCoinbalance")
@Data
public class LtCoinbalance {
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
    private Integer assetId;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String assetName;

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