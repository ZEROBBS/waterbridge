package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LeAddpledge")
@Data
public class LeAddpledge {
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
    private Integer oid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String asset;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal price;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal amount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}