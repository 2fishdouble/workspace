package com.dcj.authentication.config.refresh;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// 自动刷新
@Configuration
@ConfigurationProperties(prefix = "cj")
@Data
public class NacosPropertiesSample {
    private String name;
    private Integer age;
    private String prefix;
}
