package com.leolee.controller;

import com.leolee.api.UserServiceApi;
import com.leolee.client.MyService;
import com.leolee.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: LeoMee
 * @date: 2019年07月25 23时27分
 */
@RestController
public class IndexController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping("/index")
    @ResponseBody
    public User index(){
        User user = userServiceApi.feign();
        return user;
    }
}
