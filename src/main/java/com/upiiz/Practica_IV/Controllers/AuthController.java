package com.upiiz.Practica_IV.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
