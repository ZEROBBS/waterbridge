package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.DAppExtend")
@Data
public class DAppExtend {
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
    * 1.本地app；2：网页；3：本地页面
    */
    @ApiModelProperty(value="1.本地app；2：网页；3：本地页面")
    private Integer dtype;

    /**
    * 1：苹果；2：安卓
    */
    @ApiModelProperty(value="1：苹果；2：安卓")
    private Integer apptype;

    /**
    * 当DType=1,AppType=1时，代表UrlScheme
当DType=1,AppType=2时，代表PacketName
    */
    @ApiModelProperty(value="当DType=1,AppType=1时，代表UrlScheme 当DType=1,AppType=2时，代表PacketName")
    private String packetname;

    /**
    * 当DType=1,AppType=1时，代表AppStore的下载地址
当DType=1,AppType=2时，代表App的下载地址
    */
    @ApiModelProperty(value="当DType=1,AppType=1时，代表AppStore的下载地址 当DType=1,AppType=2时，代表App的下载地址")
    private String marketurl;

    /**
    * 当DType=2,网页的url
    */
    @ApiModelProperty(value="当DType=2,网页的url")
    private String pageurl;

    /**
    * 当DType=2，如：com.xxx.xxx.activity
    */
    @ApiModelProperty(value="当DType=2，如：com.xxx.xxx.activity")
    private String activityname;
}