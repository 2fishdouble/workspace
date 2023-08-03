package com.dcj.authentication.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author : DCJ
 * @date : 2023-08-03
 **/
// 动态刷新nacos配置
@RefreshScope
@Component
@Data
public class PropertyConfig {

    @Value("${cj.name:cj}")
    private String name;
}
