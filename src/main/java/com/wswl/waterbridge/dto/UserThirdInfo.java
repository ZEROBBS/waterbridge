package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.UserThirdInfo")
@Data
public class UserThirdInfo {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String usersn;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String nickname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String headurl;
}