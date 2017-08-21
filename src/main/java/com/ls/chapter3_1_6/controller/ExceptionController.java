package com.ls.chapter3_1_6.controller;

import com.ls.chapter3_1_6.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常处理controller
 */
@RestController
public class ExceptionController {

    @RequestMapping(value = "/myException")
    public String exceptionDemo() throws Exception {
        throw new Exception("出错了");
    }

    @RequestMapping("/json")
    public String exceptionJson() throws Exception {
        throw new MyException("出错了");
    }
}
