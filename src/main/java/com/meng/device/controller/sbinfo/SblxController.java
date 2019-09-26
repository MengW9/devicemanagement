package com.meng.device.controller.sbinfo;

import com.meng.device.config.restful.Result;
import com.meng.device.config.restful.ResultGenerator;
import com.meng.device.service.sbinfo.ISblxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 设备类型表
 * @author: WangMengWei
 * @create: 2019-09-25 11:40
 **/
@RestController
@RequestMapping("api/v1/sblx")
public class SblxController {

    @Autowired
    private ISblxService sblxService;

    @RequestMapping(value = "selectSblx", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Result selectSbInfoList() throws Exception {
        return ResultGenerator.genSuccessResult(sblxService.select());
    }
}
