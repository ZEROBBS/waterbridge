package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtUserdapp")
@Data
public class LtUserdapp {
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
    private Integer did;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer active;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal totalConsume;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}