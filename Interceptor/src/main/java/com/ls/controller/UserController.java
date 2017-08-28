package com.ls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuang 2017/8/28
 */
@RestController
public class UserController {

    @RequestMapping(value = "/login")
    //@GetMapping    等价于 @requestMapping  method= GET
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/hello")
    public String demo1() {
        return "hello";
    }

    @RequestMapping(value = "/user")
    public String demo2() {
        return "user";
    }

    @RequestMapping(value = "/login/demo")
    public String demo3() {
        return "demo3";
    }
}
