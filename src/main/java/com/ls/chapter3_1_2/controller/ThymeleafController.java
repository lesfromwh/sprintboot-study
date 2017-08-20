package com.ls.chapter3_1_2.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String index(ModelMap map) {
        map.addAttribute("host","thymeleaf-demo");
        return "index";

    }
}
