package com.reservation.car_reservation.controllers;

import com.reservation.car_reservation.models.Car;
import com.reservation.car_reservation.services.CarService;
import com.reservation.car_reservation.services.RestfulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

//    @GetMapping("/index")
//    public String index(ModelMap model){
//        return "index";
//    }

    @GetMapping("/index/{id}")
    public String carIndex(Model model, @PathVariable("id") int id){
        model.addAttribute("id",id);

        return "index/"+id;
    }
    @GetMapping("/viewbooking")
    public String booking(){
        return "booking";
    }

    @GetMapping("/registrasi")
    public String registrasi(){
        return "registrasi";
    }
}
