package com.reservation.car_reservation.controllers;

import com.reservation.car_reservation.models.User;
import com.reservation.car_reservation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.soap.Addressing;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String loginForm(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user,BindingResult bindingResult){
        User users = userService.login(user.getUsername(),user.getPassword());
        if(users == null){
            return "login";
        }
        return "redirect:/index/"+users.getId();
    }
}
