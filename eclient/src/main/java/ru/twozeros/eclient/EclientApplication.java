package ru.twozeros.eclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EclientApplication.class, args);
    }

}
