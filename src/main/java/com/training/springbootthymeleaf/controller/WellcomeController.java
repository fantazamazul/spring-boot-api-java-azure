package com.training.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WellcomeController {

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to Demo Spring Boot - Thymeleaf - Azure");
        model.addAttribute("farewell", "Greetings!!");
        return "welcome";
    }
}