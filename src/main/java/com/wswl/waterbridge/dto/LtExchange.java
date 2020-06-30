package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtExchange")
@Data
public class LtExchange {
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
    private Integer soureAsset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer targetAsset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal amount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal price;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal fee;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}