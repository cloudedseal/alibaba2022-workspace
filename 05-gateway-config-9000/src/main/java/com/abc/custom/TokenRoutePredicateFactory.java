package com.abc.custom;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 当请求中携带有一个 token 请求参数，且参数值包含配置文件中 Token 路由断言工厂指
 * 定的 token 值时才能通过认证，允许访问系统。
 */
@Component
public class TokenRoutePredicateFactory extends AbstractRoutePredicateFactory<TokenRoutePredicateFactory.Config> {

    public TokenRoutePredicateFactory() {
        super(Config.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return exchange -> {
            MultiValueMap<String, String> queryParams = exchange.getRequest().getQueryParams();
            List<String> values = queryParams.get("token");
            if (values != null && values.contains(config.getToken())) {
                return true;
            }
            return false;
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("token");
    }


    public static class Config {
        private String token;

        public Config() {
        }

        public Config(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
