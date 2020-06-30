package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtAwardconfig")
@Data
public class LtAwardconfig {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer did;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer aType;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer level;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal ratio;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;
}