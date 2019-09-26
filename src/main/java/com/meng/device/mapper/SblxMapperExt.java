package com.meng.device.mapper;


import com.meng.device.dao.Sblx;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface SblxMapperExt extends SblxMapper {

    List<Sblx> select();
}