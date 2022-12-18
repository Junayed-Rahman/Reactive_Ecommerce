package com.junayed.reactive_ecommerce.controller;

import com.junayed.reactive_ecommerce.dto.AdminDto;
import com.junayed.reactive_ecommerce.entity.Admin;
import com.junayed.reactive_ecommerce.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/admin")
public class AdminController {

    private final AdminService adminService;



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
    @PostMapping("/login-handler")
    @ResponseBody
    public String loginHandler(@ModelAttribute AdminDto adminDto){
        Admin admin = adminService.mapToAdmin(adminDto);
        if(adminService.isAuthenticard()){

        }
        return "Success";
    }
}
