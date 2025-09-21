package com.abc.provider8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// 需要加上 jpa 的配置
@EntityScan("com.abc.bean")
@EnableJpaRepositories(basePackages = "com.abc.repository")
@SpringBootApplication(scanBasePackages = "com.abc")
public class NacosAsConfigProvider8081Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosAsConfigProvider8081Application.class, args);
    }

}
