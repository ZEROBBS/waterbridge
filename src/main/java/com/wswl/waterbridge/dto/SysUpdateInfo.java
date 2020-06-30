package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysUpdateInfo")
@Data
public class SysUpdateInfo {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String appname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String packagename;

    /**
    * 版本，如：1，2
    */
    @ApiModelProperty(value="版本，如：1，2")
    private Integer versioncode;

    /**
    * 版本号：1.0.0.1
    */
    @ApiModelProperty(value="版本号：1.0.0.1")
    private String version;

    /**
    * 长度
    */
    @ApiModelProperty(value="长度")
    private Long filesize;

    /**
    * 更新描述
    */
    @ApiModelProperty(value="更新描述")
    private String remark;

    /**
    * 是否强制更新：0否；1是
    */
    @ApiModelProperty(value="是否强制更新：0否；1是")
    private Integer necessaryupdate;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date createtime;

    /**
    * 1：苹果；2；安卓
    */
    @ApiModelProperty(value="1：苹果；2；安卓")
    private Integer packagetype;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String downurl;
}