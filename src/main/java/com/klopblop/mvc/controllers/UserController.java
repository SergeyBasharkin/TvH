package com.klopblop.mvc.controllers;

import com.klopblop.mvc.forms.RegistrationFormBean;
import com.klopblop.mvc.models.UserInfo;
import com.klopblop.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Admin on 24.09.2016.
 */
@Controller
@RequestMapping("/signup")
public class UserController {
    @Autowired
    HttpServletRequest request;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String signUp() {
        request.setAttribute("singUpForm", new RegistrationFormBean());
        return "registration/registrationPage";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String signUp(
            @Valid @ModelAttribute("singUpForm") RegistrationFormBean registrationFormBean,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", bindingResult.getFieldErrors().get(0).getField());
            return "registration/registrationPage";
        }
        String hashPassword = DigestUtils.md2Hex(registrationFormBean.getPassword());
        UserInfo userInfo = new UserInfo(registrationFormBean.getEmail(), hashPassword, registrationFormBean.getName());
        userService.registration(userInfo);
        return "redirect:/hello";
    }
}
