package com.meng.device.service.sbinfo;


import com.meng.device.dao.SbInfo;
import com.meng.device.dao.VO.SbInfoVO;

import java.util.List;

public interface ISbInfoService {

    List<SbInfoVO> selectSbInfo();

    void insertSbInfo(SbInfo sbInfo);

    int selectInfoName(String name);
}
