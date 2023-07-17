package com.dcj.authenticationclient.fallback;

import com.dcj.authenticationclient.client.IAuthenticationClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author : DCJ
 * @date : 2023-07-17
 **/
@Component
@Slf4j
public class AuthenticationFallbackFactory implements FallbackFactory<IAuthenticationClient> {
    @Override
    public IAuthenticationClient create(Throwable throwable) {
        return new IAuthenticationClient() {
            @Override
            public void run() {
                log.error("Authentication调用失败.");
            }
        };
    }
}
