package com.wswl.waterbridge.controller;


import com.wswl.waterbridge.common.RegexUtils;
import com.wswl.waterbridge.dto.LtUser;
import com.wswl.waterbridge.response.CommonResult;
import com.wswl.waterbridge.response.ResultCode;
import com.wswl.waterbridge.service.LtUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/user")
@RestController
public class UserController {


    @Autowired
    LtUserService userService;

    /**
     * @ClassName UserController
     * @Description 用户注册
     * @param request
     * @param user
     * @return org.springframework.http.ResponseEntity
     * @Author xuyan
     * @Date 2020-06-30 10:05
     * @Version 1.0
     */
    @ApiOperation("用户注册")
    @PostMapping("/register")
    public CommonResult register(HttpServletRequest request, @RequestBody LtUser user){

        if(user == null || StringUtils.isAllBlank(user.getUsername(),user.getPhone(),user.getMsgcode())){
            return CommonResult.failed(ResultCode.PARAM_NULL);
        }

        //手机号格式校验
        if(!RegexUtils.isPhone(user.getPhone())){
            return CommonResult.failed(ResultCode.PHONE_INVAILD);
        }

        //验证码校验
        if(!StringUtils.equals(user.getMsgcode(),"1234")){
            return CommonResult.failed(ResultCode.MSG_CODE_ERROR);
        }

        //判断用户手机号是否已注册
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("phone", user.getPhone());
        paramMap.put("limit", "1");
        if (userService.selectUser(paramMap) != null)
        {
            return CommonResult.failed(ResultCode.PHONE_EXIST);
        }

        return userService.register(user);

    }


}
