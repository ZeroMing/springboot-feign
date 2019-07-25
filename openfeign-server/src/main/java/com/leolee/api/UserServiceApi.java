package com.leolee.api;

import com.leolee.feign.UserFeignService;
import com.leolee.model.User;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.stereotype.Service;

/**
 * @description: 对外API
 * @author: LeoMee
 * @date: 2019年07月25 23时22分
 */
@Service
public class UserServiceApi {

    private UserFeignService init()
    {
        return Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .target(UserFeignService.class, "http://127.0.0.1:8888/");

    }

    public User feign()
    {
        UserFeignService userFeign = init();
        return userFeign.feign();
    }

//    //此处相当于访问http://localhost:1234/aaa/m1?p1=xxxx
//    //注意：c1是controller的映射，m1是方法映射，而上面的aaa是项目名
//    @RequestMapping("/c1/m1")
//    String method1(@RequestParam("p1") String p1);
//
//    @GetMapping("/api/test")
//    @ResponseBody
//    String testApi();
//
////    //*****注意此处User,挺有意思的，被调用的服务哪怕返回的不会User类，只要字段名字一样，
////    //值就会传递过来，网上有例子写实现Seralizable接口，全限定名一样什么的，纯属没有任何用，
////    //spring是使用jackson直接json转换的
////    @RequestMapping("/c1/m2")
////    User method2(@RequestParam("p1") String p1);
////
////    //*****注意：以下方式摘自网上，我没有亲自试验过，但是觉得可行，所以我就复制过来了
////    // //feign独有的注解方式
////    @RequestLine("GET /user/index")
////    String index();
////
////    @RequestMapping(value = "/get0/{id}", method = RequestMethod.GET)
////    User findById(@PathVariable("id") Long id);
////
////    @RequestMapping(value = "/get1", method = RequestMethod.GET)
////    User get1(@RequestParam("id") Long id, @RequestParam("name") String name);
////
////    @RequestMapping(value = "/get2", method = RequestMethod.GET)
////    User get2(@RequestParam Map<String, Object> map);
////
////    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
////    User hello2(@RequestHeader("name") String name,
////                @RequestHeader("age") Integer age);
////
////    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
////    String hello3(@RequestBody User user);

}
