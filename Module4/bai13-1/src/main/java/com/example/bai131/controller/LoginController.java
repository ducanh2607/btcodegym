package com.example.bai131.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController {
    @GetMapping("/template")
    public String shown(){
        return "/template";
    }

}
