package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.abc")
public class ConfigGateway9000 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGateway9000.class, args);
    }

}


