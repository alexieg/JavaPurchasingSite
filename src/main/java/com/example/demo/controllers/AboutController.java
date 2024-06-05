package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@Controller
public class AboutController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
