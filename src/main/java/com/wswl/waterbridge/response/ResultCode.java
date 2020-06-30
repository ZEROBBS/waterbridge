package com.wswl.waterbridge.response;

/**
 * 枚举了一些常用API操作码
 * Created by macro on 2019/4/19.
 */
public enum ResultCode {
    PARAM_NULL(1001,"参数不能为空"),
    PHONE_INVAILD(1002,"手机号格式错误"),
    MSG_CODE_ERROR(1003,"验证码错误"),
    RECOMMEND_ERROR(1004,"推荐码错误"),
    PHONE_EXIST(1004,"手机号已注册"),
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}


