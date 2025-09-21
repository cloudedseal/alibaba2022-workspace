package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.abc")
@EnableFeignClients
public class OpenFeignConsumer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumer8080Application.class, args);
    }

}


