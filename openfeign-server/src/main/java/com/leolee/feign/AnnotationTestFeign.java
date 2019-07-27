package com.leolee.feign;

import com.leolee.model.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: LeoMee
 * @date: 2019年07月27 08时51分
 */

@FeignClient(name = "server",url = "http://127.0.0.1:8888")
public interface AnnotationTestFeign {

    @RequestMapping(value = "/server/user", method = RequestMethod.GET)
    @ResponseBody
    User getUserById(@RequestParam("userId") String userId);
}
