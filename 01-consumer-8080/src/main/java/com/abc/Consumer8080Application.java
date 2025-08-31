package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.abc")
public class Consumer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer8080Application.class, args);
    }

}


