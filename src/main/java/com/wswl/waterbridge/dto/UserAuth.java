package com.wswl.waterbridge.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com.wswl.waterbridge.dto.UserAuth")
@Data
public class UserAuth {
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
    * 身份证号码
    */
    @ApiModelProperty(value="身份证号码")
    private String idcardcode;

    /**
    * 真实姓名
    */
    @ApiModelProperty(value="真实姓名")
    private String realname;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String idcardimg1;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String idcardimg2;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String idcardimg3;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private String country;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date createtime;

    /**
    * 认证审核
    */
    @ApiModelProperty(value="认证审核")
    private Integer checked;

    /**
    * 1：身份证；2：护照
    */
    @ApiModelProperty(value="1：身份证；2：护照")
    private Short cardtype;

    /**
    * 认证审核信息
    */
    @ApiModelProperty(value="认证审核信息")
    private String authmsg;

    /**
    * 审核人
    */
    @ApiModelProperty(value="审核人")
    private String checkuser;

    /**
    * 
    */
    @ApiModelProperty(value="")
    private Date checktime;

    /**
    * 1：姓名；2：证件号码；3：正面；4：反面；5：手持
    */
    @ApiModelProperty(value="1：姓名；2：证件号码；3：正面；4：反面；5：手持")
    private String authcode;
}