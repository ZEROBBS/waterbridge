package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysNotice")
@Data
public class SysNotice {
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
    private String cncontext;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String encontext;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String imgurl;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date createtime;
}