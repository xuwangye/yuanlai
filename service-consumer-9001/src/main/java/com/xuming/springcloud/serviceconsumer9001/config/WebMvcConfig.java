package com.xuming.springcloud.serviceconsumer9001.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web相关的配置
 * <p>
 * Created by zhongjunkai on 18/11/20.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Value("${file.path}")
    private String filePath;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("PUT", "DELETE", "GET", "POST")
                .allowedHeaders("*")
                .allowCredentials(true)
                .exposedHeaders("access-control-allow-headers",
                        "access-control-allow-methods",
                        "access-control-allow-origin");
    }

    /**
     * addResourceHandler 是暴露出去的访问路径
     * addResourceLocations 是实际访问路径，file代表外部文件，classpath代表内部文件
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**")
                .addResourceLocations("file:" + filePath);

    }
}
