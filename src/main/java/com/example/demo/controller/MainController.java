package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public String getHelloPage(Model model){
        model.addAttribute("name", "Qarlygash");
        return "hello.html";
    }
}
