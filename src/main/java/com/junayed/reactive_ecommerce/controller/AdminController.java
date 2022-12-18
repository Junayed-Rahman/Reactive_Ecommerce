package com.junayed.reactive_ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @GetMapping(value = {"/","/panel"})
    public String showAdminPanel(Model model){
        model.addAttribute("title","Admin Panel");
        return "private/AdminPanel";
    }

    @GetMapping("/login")
    public String showLoginPage(Model model){
        model.addAttribute("title","Admin Login Page");
        return "public/AdminLoginPage";

    }
}
