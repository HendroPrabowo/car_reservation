package com.reservation.car_reservation.controllers;

import com.reservation.car_reservation.models.Car;
import com.reservation.car_reservation.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/index")
    public ModelAndView index(ModelMap model){
        List<Car> cars = carService.findAll();

        return new ModelAndView("index", "cars", cars);
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
