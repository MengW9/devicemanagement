package com.meng.device.service.sbinfo.impl;

import com.meng.device.dao.SbInfo;
import com.meng.device.dao.VO.SbInfoVO;
import com.meng.device.mapper.SbInfoMapperExt;
import com.meng.device.service.sbinfo.ISbInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 设备表
 * @author: WangMengWei
 * @create: 2019-09-25 11:14
 **/
@Service
public class sbinfoServiceImpl implements ISbInfoService {

    @Autowired
    private SbInfoMapperExt abInfoMapperExt;

    /**
     * @Description： 查询设备列表
     * @Param： []
     * @Author： WangMengWei
     * @Date： 2019-09-25
     * @Time： 11:21
     */
    @Override
    public List<SbInfoVO> selectSbInfo() {
        return abInfoMapperExt.selectSbInfo();
    }

    /**
     * @Description： 新增设备
     * @Param： [abInfo]
     * @return： void
     * @Author： WangMengWei
     * @Date： 2019-09-25
     * @Time： 11:21
     */
    @Override
    public void insertSbInfo(SbInfo sbInfo) {
        abInfoMapperExt.insert(sbInfo);
    }

    @Override
    public int selectInfoName(String name) {
        int i = 0;
        try {
            i=abInfoMapperExt.selectInfoName(name);
        }catch (Exception e){

        }
        return i;
    }
}
