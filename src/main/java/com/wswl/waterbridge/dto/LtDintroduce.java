package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.LtDintroduce")
@Data
public class LtDintroduce {
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
    private String title;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String introduce;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String lang;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;
}