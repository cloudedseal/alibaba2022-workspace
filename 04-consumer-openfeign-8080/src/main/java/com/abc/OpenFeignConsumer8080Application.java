package com.abc;

import com.abc.config.LoadBalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@LoadBalancerClients(defaultConfiguration = LoadBalanceConfig.class)
@SpringBootApplication(scanBasePackages = "com.abc")
@EnableFeignClients
public class OpenFeignConsumer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumer8080Application.class, args);
    }

}


