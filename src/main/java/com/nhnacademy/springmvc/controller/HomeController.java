package com.nhnacademy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                         // <-- Controller 임을 지정
public class HomeController {
    @GetMapping("/")                // <-- HTTP Method 지정, URL 맵핑
    public String index() {
        return "index";             // <-- view 이름 지정
    }
}