package com.meng.device.mapper;

import com.meng.device.dao.VO.SbInfoVO;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface SbInfoMapperExt extends SbInfoMapper {

    List<SbInfoVO> selectSbInfo();

    int selectInfoName(String name);
}