package com.dcj.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Unable to find GatewayFilterFactory with name RequestRateLimiter
 */
@Component("apiKeyResolver")
public class ApiKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        String apiKey = exchange.getRequest().getPath().toString();
        return Mono.just(apiKey);
    }
}
