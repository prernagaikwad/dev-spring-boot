package com.prernagaikwad.springboot.demosecurity.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Democontroller
{


    @GetMapping("/")
    public String showHome()
    {
        return "home" ;
    }
}
