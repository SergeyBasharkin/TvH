package com.klopblop.mvc.controllers;

import com.klopblop.mvc.Repositories.UserDao;
import com.klopblop.mvc.models.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.awt.ModalExclude;

/**
 * Created by Admin on 20.09.2016.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","hego");
        return "main/hello";
    }
}
