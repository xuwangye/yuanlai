package com.xuming.springcloud.serviceconsumer9001;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.xuming.springcloud")
@EnableFeignClients(basePackages = "com.xuming.springcloud")
@EnableDiscoveryClient
@EnableCircuitBreaker//对hystrix熔断机制的支持
@EnableHystrixDashboard
public class ServiceConsumer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer9001Application.class, args);
    }

    @Bean
    IRule iRule(){
        return new RandomRule();//ribbon 随机访问
    }

//    @Bean
//    public ServletRegistrationBean getServlet() {
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.addUrlMappings("/hystrix.stream");
//        registrationBean.setName("HystrixMetricsStreamServlet");
//        return registrationBean;
//    }

    @Bean
    public HystrixCommandAspect hystrixAspect(){
        return new com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect();
    }

}
