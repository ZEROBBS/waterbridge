package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.SysAccount")
@Data
public class SysAccount {
    /**
    * 
    */
    @ApiModelProperty(value="")
    private String id;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String account;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String password;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer datastatus;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String usersecret;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String realname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date logintime;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date createtime;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Integer isadmin;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String createid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String roleid;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String rolename;
}