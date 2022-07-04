package com.poke.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login(){
        return "login";
    }
    @PostMapping("/loginIn")
    public String loginIn(){
        System.out.println("hello");
        System.out.println("修改了");
        return "null";
    }
}
