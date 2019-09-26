package com.meng.device.controller.sbinfo;

import com.meng.device.config.restful.Result;
import com.meng.device.config.restful.ResultGenerator;
import com.meng.device.dao.SbInfo;
import com.meng.device.service.sbinfo.ISbInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Map;

/**
 * @description: 设备信息
 * @author: WangMengWei
 * @create: 2019-09-25 11:29
 **/

@RestController
@RequestMapping("api/v1/sbinfo")
public class SbInfoController {

    @Autowired
    private ISbInfoService sbinfoService;

    @RequestMapping(value = "selectSbInfo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Result selectSbInfoList() throws Exception {
        return ResultGenerator.genSuccessResult(sbinfoService.selectSbInfo());
    }

    @RequestMapping(value = "insertSbInfo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertSbInfo(@RequestParam Map<String, Object> paramMap) throws Exception {
        String sbname = paramMap.get("sbname").toString();
        String sbscrq = paramMap.get("sbscrq").toString();
        String sbwyrxb = paramMap.get("sbwyrxb").toString();
        String sbjg = paramMap.get("sbjg").toString();
        String sblxId = paramMap.get("sblxId").toString();
        if (sbname.isEmpty() || sbscrq.isEmpty() || sbwyrxb.isEmpty() || sbjg.isEmpty() || sblxId.isEmpty()) {
            throw new Exception("设备信息不能为空");
        }
        SbInfo sbInfo = new SbInfo();
        sbInfo.setSbname(sbname);
        sbInfo.setSbscrq(Date.valueOf(sbscrq));
        sbInfo.setSbwyrxb(sbwyrxb);
        sbInfo.setSbjg(Integer.parseInt(sbjg));
        sbInfo.setSblxId(Integer.parseInt(sblxId));
        sbinfoService.insertSbInfo(sbInfo);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * @Description： 设备名称查重
     * @Param：
     * @return：
     * @Author： WangMengWei
     * @Date： 2019-09-25
     * @Time： 15:15
     */
    @RequestMapping(value = "selectInfo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result selectSbInfo(String name) throws Exception {
        return ResultGenerator.genSuccessResult(sbinfoService.selectInfoName(name));
    }
}
