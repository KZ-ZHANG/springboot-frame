package com.zkz.service.impl;

import com.zkz.dao.BaseMapper;
import com.zkz.entity.SysConfig;
import com.zkz.mapper.SysConfigMapper;
import com.zkz.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysConfigServiceImpl implements ISysConfigService {

    @Autowired
    private SysConfigMapper sysConfigMapper;

    public BaseMapper<SysConfig> getMapper() {
        return sysConfigMapper;
    }
}
