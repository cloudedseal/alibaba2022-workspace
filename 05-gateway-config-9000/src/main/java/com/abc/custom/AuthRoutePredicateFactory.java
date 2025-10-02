package com.abc.custom;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 当请求头中携带有用户名与密码的 key-value 对，且其用户名与配置文件中 Auth 路由断
 * 言工厂中指定的 username 相同，密码中包含 Auth 路由断言工厂中指定的 password 时才能
 * 通过认证，允许访问系统。
 * 功能前缀 Auth
 * 固定 RoutePredicateFactory
 */
@Component
public class AuthRoutePredicateFactory  extends AbstractRoutePredicateFactory<AuthRoutePredicateFactory.Config> {

    public AuthRoutePredicateFactory() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("username", "password");
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return exchange -> {
            HttpHeaders headers = exchange.getRequest().getHeaders();
            List<String> pwds = headers.get(config.getUsername());
            if (pwds != null && pwds.contains(config.getPassword())) {
                return true;
            }
            return false;
        };
    }

    public static class Config {
        private String username;
        private String password;

        public Config() {
        }

        public Config(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
