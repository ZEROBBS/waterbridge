package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LeRecord")
@Data
public class LeRecord {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String sn;

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
    private Integer pid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal amount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal pledgeValue;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal lAmount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal tLAmount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal eAmount;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal fee;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal cPrice;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal lPrice;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal pledgeRatio;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String rdate;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal closeCPrice;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal closeLPrice;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer flag;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long hTime;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;
}