package com.xuming.springcloud.yuanlaigetway9009;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class YuanlaiGetway9009Application {

    public static void main(String[] args) {
        SpringApplication.run(YuanlaiGetway9009Application.class, args);
    }

}
