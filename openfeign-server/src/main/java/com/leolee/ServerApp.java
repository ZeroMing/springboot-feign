package com.leolee;

import com.leolee.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.leolee"})
@RestController
@RequestMapping("/server")
public class ServerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServerApp.class, args);
    }

    @GetMapping("/feign")
    @ResponseBody
    public User feign(){
        System.out.println("feign......");
        // testApi 接口调用
        User user = new User();
        user.setName("feign");
        return user;
    }

}
