package com.meng.device.config.restful;

/**
 * <pre>
 *    Http接口结果返回的对象
 * </pre>
 * Created by sirius on 2018/9/21.
 *
 * @author sirius
 * @since 1.0
 */
public class Result {
    private Integer status;
    private String message;
    private Object data;

    public Integer getStatus() {
        return status;
    }

    public Result setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }


    public Result() {

    }
}
