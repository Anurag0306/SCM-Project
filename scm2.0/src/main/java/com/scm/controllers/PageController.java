package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework. web.bind.annotation.RequestMapping;

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
    public String aboutpage() {
        System.out.println("About page handler");
        return "about";
    }
    @RequestMapping("/services")
    public String Servicepage() {
        System.out.println("Services page handler");
        return "services";
    }


}
