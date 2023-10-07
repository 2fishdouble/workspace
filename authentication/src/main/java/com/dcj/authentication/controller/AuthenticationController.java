package com.dcj.authentication.controller;

import com.dcj.authentication.config.refresh.NacosConfigurationPropertiesSample;
import com.dcj.authentication.config.refresh.NacosValueSample;
import com.dcj.authentication.config.refresh.PropertyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DCJ
 * @date : 2023-06-09
 **/
@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    @GetMapping("/run")
    public void run (){
        System.out.println("x");
    }

    @Autowired
    private PropertyConfig propertyConfig;
    @Autowired
    private NacosConfigurationPropertiesSample nacosConfigurationPropertiesSample;
    @Autowired
    private NacosValueSample nacosValueSample;

    // region 动态刷新
    @GetMapping("/propertyConfigDetail")
    public void propertyConfigDetail(){
        System.out.println(propertyConfig.getName());
        System.out.println(nacosConfigurationPropertiesSample.getName());
        System.out.println(nacosValueSample.getName());

    }


    // endregion
}
