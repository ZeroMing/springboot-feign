package com.leolee.feign;

import com.leolee.model.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: LeoMee
 * @date: 2019年07月26 01时33分
 */
public interface UserFeignService {

    /**
     * 根据userId获取用户信息
     * @return
     */
    @RequestLine("GET /server/feign")
    @ResponseBody
    User feign();
}
