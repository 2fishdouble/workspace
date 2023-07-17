package com.dcj.authenticationclient.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Feign配置
 *
 * @author S
 * @date 2023/07/17
 */
@Configuration
@EnableFeignClients("com.dcj.authenticationclient.client")
public class FeignConfig {
}
