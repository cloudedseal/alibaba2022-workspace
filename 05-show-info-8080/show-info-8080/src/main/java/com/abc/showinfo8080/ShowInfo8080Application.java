package com.abc.showinfo8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.abc")
public class ShowInfo8080Application {

    public static void main(String[] args) {
        SpringApplication.run(ShowInfo8080Application.class, args);
    }

}
