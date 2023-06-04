package com.spring.url.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class URLController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello 접속 감지");
        return "hello";
    }
}
