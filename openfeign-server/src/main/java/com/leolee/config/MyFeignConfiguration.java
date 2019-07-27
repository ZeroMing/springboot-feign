package com.leolee.config;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: LeoMee
 * @date: 2019年07月25 23时55分
 */
@Configuration
public class MyFeignConfiguration {

    /**
     * 使用 feign.Contract 代替 SpringMVC Contract
     * @return
     */
    @Bean
    public Contract feignContract(){
        return new SpringMvcContract();
    }

    /**
     * 还可以配置Eureka的用户名和密码
     */

}
