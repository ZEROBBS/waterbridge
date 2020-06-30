package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.UserBaseInfo")
@Data
public class UserBaseInfo {
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
    private BigDecimal userbalance;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private BigDecimal userconsume;

    /**
    * 一个dapp一个余额
    */
    @ApiModelProperty(value="一个dapp一个余额")
    private String dappsn;
}