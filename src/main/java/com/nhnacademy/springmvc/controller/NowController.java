package com.nhnacademy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class NowController {
    @GetMapping("/now")
    public String now(Model model) {
        model.addAttribute("now", new Date().toString());

        return "now";
    }
}