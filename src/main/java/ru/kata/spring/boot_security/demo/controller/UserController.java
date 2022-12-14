package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String showUserPage(ModelMap model) {
        model.addAttribute("user",
                SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return "user";
    }
}
