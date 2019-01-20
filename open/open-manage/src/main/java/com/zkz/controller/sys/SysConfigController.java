package com.zkz.controller.sys;

import com.zkz.entity.SysConfig;
import com.zkz.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: ZKZ
 * @Date: 2019/1/16
 **/
@RestController
@RequestMapping("sysConfig")
public class SysConfigController {

    @Autowired
    private ISysConfigService sysConfigService;

    @RequestMapping("one")
    public String getConfig() {
        SysConfig sysConfig = sysConfigService.getById("diagnostics.include_raw");
        return sysConfig.getValue();
//        return "success";
    }

}
