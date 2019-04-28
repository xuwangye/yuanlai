package com.xuming.springcloud.serviceproducer8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ServiceProducer8002Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProducer8002Application.class, args);
    }

}
