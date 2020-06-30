package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.DAppSecret")
@Data
public class DAppSecret {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String dappsn;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String publickey;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String privatekey;
}