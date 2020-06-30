package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysShare")
@Data
public class SysShare {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String cnname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String enname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String linkurl;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String language;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer sort;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer del;

    /**
    * 1：海报；2：白皮书；3：演示文件:4：视觉规范
    */
    @ApiModelProperty(value="1：海报；2：白皮书；3：演示文件:4：视觉规范")
    private Integer type;
}