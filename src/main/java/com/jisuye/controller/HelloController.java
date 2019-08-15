package com.jisuye.controller;

import com.jisuye.annotations.web.Controller;
import com.jisuye.annotations.web.GetMapping;
import com.jisuye.annotations.web.RequestParam;

@Controller("/")
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "hello "+name;
    }
}
