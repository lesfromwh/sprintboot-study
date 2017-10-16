package com.ls.configurationpropertiestest.controller;

import configurationproperties.ls.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuang 2017/9/1
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/")
    public String demo() {
        return helloService.sayHello();
    }
}
