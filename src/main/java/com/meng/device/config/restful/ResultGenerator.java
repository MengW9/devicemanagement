package com.meng.device.config.restful;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *   http接口返回结果构造器
 * </pre>
 *
 */
public class ResultGenerator {

    /**
     * 无参数返回成功状态
     *
     * @return
     */
    public static Result genSuccessResult() {
        return new Result()
//                .setCode(ResultCode.CODE_200.getCode())
                .setStatus(ResultCode.CODE_200.getStatus())
                .setMessage(ResultCode.CODE_200.getDescribe());
    }

    /**
     * 有参数返回成功状态
     *
     * @param data 计算结果对象
     * @return
     */
    public static Result genSuccessResult(Object data) {
        return new Result()
//                .setCode(ResultCode.CODE_200.getCode())
                .setStatus(ResultCode.CODE_200.getStatus())
                .setMessage(ResultCode.CODE_200.getDescribe())
                .setData(data);
    }

    /**
     * 有参数返回失败状态
     *
     * @param message 失败原因
     * @return
     */
    public static Result genFailResult(String message) {
        return new Result()
                .setStatus(ResultCode.CODE_500.getStatus())
                .setMessage(message);
//                .setCode(code);
    }

    public static void main(String[] rags) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("isLogin", true);
        System.out.println(JSON.toJSONString(ResultGenerator.genSuccessResult(param)));
        System.out.println(JSON.toJSONString(ResultGenerator.genFailResult("失败异常信息")));
    }
}
