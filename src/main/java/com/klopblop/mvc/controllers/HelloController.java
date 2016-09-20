package com.klopblop.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 20.09.2016.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "main/hello";
    }
}
