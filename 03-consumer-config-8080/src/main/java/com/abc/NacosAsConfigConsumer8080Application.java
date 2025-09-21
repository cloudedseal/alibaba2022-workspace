package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.abc")
public class NacosAsConfigConsumer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosAsConfigConsumer8080Application.class, args);
    }

}


