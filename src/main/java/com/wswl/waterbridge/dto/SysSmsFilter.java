package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysSmsFilter")
@Data
public class SysSmsFilter {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String mobilecode;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fmobile;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date fcreatetime;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String templatecode;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String fcontent;
}