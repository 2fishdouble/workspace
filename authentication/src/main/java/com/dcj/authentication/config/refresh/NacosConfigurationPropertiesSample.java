package com.dcj.authentication.config.refresh;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author : DCJ
 * @date : 2023-08-03
 **/
// 动态刷新nacos配置
@Component
@NacosConfigurationProperties(prefix = "cj",
        dataId = "application-authentication.yaml",
        autoRefreshed = true,
        type = ConfigType.PROPERTIES
)
public class NacosConfigurationPropertiesSample {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
