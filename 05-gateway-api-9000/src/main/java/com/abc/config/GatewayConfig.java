package com.abc.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Configuration
public class GatewayConfig {


    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        ZonedDateTime zonedDateTime = LocalDateTime.now().minusDays(3).atZone(ZoneId.systemDefault());
        ZonedDateTime zonedDateTime2 = LocalDateTime.now().plusDays(3).atZone(ZoneId.systemDefault());
        return builder
                .routes()
                .route("query_route",ps->ps.query("color","gr.+").and().query("size").uri("https://www.douban.com"))
                .route("remote_addr_route",ps->ps.remoteAddr("192.168.1.110").uri("https://www.bing.com"))
                .route("consumer_route",ps->ps.path("/consumer/**").uri("http://localhost:8080"))
                .route("provider_route",ps->ps.path("/provider/**").uri("http://localhost:8081"))
                .route("baidu_route",ps->ps.path("/bd").uri("https://www.baidu.com"))
                .route("taobao_route",ps->ps.path("/tb").uri("https://www.taobao.com"))
                .route("jd_route",ps->ps.path("/jd").uri("https://www.jd.com"))
//                .route("after_route",ps->ps.after(zonedDateTime).uri("https://www.bilibili.com"))
//                .route("before_route",ps->ps.before(zonedDateTime).uri("https://www.youku.com"))
//                .route("between_route",ps->ps.between(zonedDateTime,zonedDateTime2).uri("https://www.youku.com"))
                .route("cookie_route",ps->ps.cookie("city","beijing").uri("https://www.zhihu.com/"))
                .route("header_route",ps->ps.header("X-Request-Id").uri("https://www.github.com"))
                .route("header_route_2",ps->ps.header("X-Request","\\d+").uri("https://www.weibo.com"))
                .route("host_route",ps->ps.host("mylocalhost").uri("https://www.douban.com"))
                .route("method_route",ps->ps.method("PATCH").uri("https://www.douban.com"))
                .route("x_forward_for_route",ps->ps.xForwardedRemoteAddr("10.10.10.10").uri("https://www.douban.com"))

                .build();
    }
}
