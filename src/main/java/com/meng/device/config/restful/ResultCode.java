package com.meng.device.config.restful;

/**
 * <pre>
 *   http接口返回的状态码标识
 * </pre>
 * Created by sirius on 2018/9/21.
 *
 * @author sirius
 * @since 1.0
 */
public enum ResultCode {
    CODE_200(200, 200, "success"),
    CODE_401(401, 401, "illegal access"),
    CODE_402(402, 402, "your token has expired"),
    CODE_403(403, 403, "you have no authority to access"),
    CODE_405(405, 405, "data is null"),
    CODE_500(500, 500, "runtime exception");

    private final Integer code;
    private final Integer status;
    private final String describe;

    ResultCode(Integer code, Integer status, String describe) {
        this.code = code;
        this.status = status;
        this.describe = describe;
    }

    public Integer getCode() {
        return code;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDescribe() {
        return describe;
    }
}
