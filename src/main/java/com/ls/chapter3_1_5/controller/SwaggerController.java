package com.ls.chapter3_1_5.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @ApiOperation(value = "swagger测试",notes = "notes")
    @RequestMapping(value="/swagger2",method = RequestMethod.GET)
    public String index() {
        return "swagger2";
    }
}
