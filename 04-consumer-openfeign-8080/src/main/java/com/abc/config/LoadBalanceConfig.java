package com.abc.config;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * 自定义负载均衡配置
 */
public class LoadBalanceConfig {

    @Bean
    public ReactorLoadBalancer<ServiceInstance> loadBalancer(Environment e, LoadBalancerClientFactory factory) {
        // 服务提供者服务名
        String serviceName = e.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
        // 随机返回一个服务提供者
        return new RandomLoadBalancer(factory.getLazyProvider(serviceName, ServiceInstanceListSupplier.class), serviceName);
    }
}
