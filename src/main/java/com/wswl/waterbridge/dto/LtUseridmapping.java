package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtUseridmapping")
@Data
public class LtUseridmapping {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer userId;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String xifaddress;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer uid;
}