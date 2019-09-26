package com.meng.device.service.sbinfo.impl;

import com.meng.device.dao.Sblx;
import com.meng.device.mapper.SblxMapperExt;
import com.meng.device.service.sbinfo.ISblxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 设备类型
 * @author: WangMengWei
 * @create: 2019-09-25 11:16
 **/
@Service
public class ISblxServiceImpl implements ISblxService {

    @Autowired
    private SblxMapperExt sblxMapperExt;

    @Override
    public List<Sblx> select() {
        return sblxMapperExt.select();
    }
}
