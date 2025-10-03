package com.abc.custom;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

/**
 * AddHeader 功能前缀
 * GatewayFilterFactory 固定
 */
@Component
public class AddHeaderGatewayFilterFactory extends AbstractNameValueGatewayFilterFactory {
   
    @Override
    public GatewayFilter apply(NameValueConfig config) {
        return ((exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest()
                    .mutate().header(config.getName(),config.getValue()).build();
            exchange.mutate().request(request).build();
            return chain.filter(exchange);
        });
    }
}
