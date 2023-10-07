package com.dcj.authentication.config.refresh;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosIgnore;
import com.alibaba.nacos.api.config.annotation.NacosProperty;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
public class NacosValueSample {
    @NacosValue(value = "${cj.age:dcj}", autoRefreshed = true)
    private String name;
}
