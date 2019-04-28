package com.xuming.springcloud.serviceproducer8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.xuming.springcloud")
//@EnableEurekaClient
public class ServiceProducer8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProducer8001Application.class, args);
    }

}
