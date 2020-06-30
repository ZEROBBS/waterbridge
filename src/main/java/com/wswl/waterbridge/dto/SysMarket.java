package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysMarket")
@Data
public class SysMarket {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cntitle;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String entitle;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cnlinkurl;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String enlinkurl;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date createtime;
}