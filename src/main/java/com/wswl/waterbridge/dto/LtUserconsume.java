package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtUserconsume")
@Data
public class LtUserconsume {
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
    private Integer did;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String batch;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal amount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal fee;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal ratio;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal value;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}