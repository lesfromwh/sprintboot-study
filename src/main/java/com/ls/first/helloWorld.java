package com.ls.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testng.Assert;

@RestController
public class helloWorld {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello world";
    }
}
