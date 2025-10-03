package com.abc.custom.prepost;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ThreeGatewayFilterFactory extends AbstractNameValueGatewayFilterFactory {
    Logger logger = LoggerFactory.getLogger(ThreeGatewayFilterFactory.class);
    @Override
    public GatewayFilter apply(NameValueConfig config) {
        return ((exchange, chain) -> {
            long start = System.currentTimeMillis();
            logger.info(config.getName() + "-" + config.getValue() + "startTime:" + start);
            exchange.getAttributes().put("startTime", start);
            return chain.filter(exchange).then(
                    Mono.fromRunnable(() -> {
                        Object startTime = exchange.getAttributes().get("startTime");
                        long endTime = System.currentTimeMillis();
                        exchange.getAttributes().put("endTime", endTime);
                        long elapsedTime = endTime - start;
                        logger.info(config.getName() + "-" + config.getValue() + "elapsedTime:" + elapsedTime);
                        logger.info("three:" + elapsedTime);
                    })
            );
        });
    }
}
