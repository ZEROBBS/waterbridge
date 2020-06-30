package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtDapp")
@Data
public class LtDapp {
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
    private String cnName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String enName;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String label;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String address;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer category;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String icon;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal aConsume;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer status;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer tFlag;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal consumeMin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String notifyUrl;

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
    private Integer del;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Long times;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer sort;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer show;

    /**
    * 来源，如gcoinbuy
    */
    @ApiModelProperty(value="来源，如gcoinbuy")
    private String source;
}