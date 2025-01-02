package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework. web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name","Anurag");
        model.addAttribute("project","SCM");
        return "home";
    }
    @RequestMapping("/about")
    public String aboutpage (@RequestParam(value = "name", defaultValue = "Guest") String name,
            Model model) {
        // Add data to the Model
        model.addAttribute("userName", "name"); 
        System.out.println("About page handler");
        return "about";
    }
    @RequestMapping("/services")
    public String Servicepage() {
        System.out.println("Services page handler");
        return "services";
    }
    @RequestMapping("/contact")
    public String contact() {
        System.out.println("contact page handler");
        return new String("contact");
    }

    @GetMapping("/login")
    public String login() {
        return new String("login");
    }
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }
}
