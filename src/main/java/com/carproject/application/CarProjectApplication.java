package com.carproject.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.carproject")
@EntityScan(basePackages = "com.carproject")
public class CarProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarProjectApplication.class, args);


    }

}
