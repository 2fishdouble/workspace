package com.dcj.authenticationclient.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 *
 * @author S
 * @date 2023/07/17
 */
@FeignClient(value = "authentication")
public interface IAuthenticationClient {
    @GetMapping("/auth/run")
    void run();
}
