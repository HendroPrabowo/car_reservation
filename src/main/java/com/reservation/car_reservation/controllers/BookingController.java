package com.reservation.car_reservation.controllers;

import com.reservation.car_reservation.models.Booking;
import com.reservation.car_reservation.models.Car;
import com.reservation.car_reservation.models.User;
import com.reservation.car_reservation.repository.BookingRepository;
import com.reservation.car_reservation.services.BookingService;
import com.reservation.car_reservation.services.CarService;
import com.reservation.car_reservation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;
    UserService userService;
    CarService carService;

    @GetMapping("/bookings")
    public ModelAndView bookings(ModelMap model){
        List<Booking> bookings = bookingService.findAll();

        return new ModelAndView("allBookings","bookings",bookings);
    }

    @GetMapping("/booking/{id}")
    public String bookingForm(Model model, @PathVariable("id") int id){
        model.addAttribute("id", id);
        model.addAttribute("booking", new Booking());

        return "booking";
    }

    @PostMapping(value = "/booking/{id}")
    public String createBooking(@ModelAttribute Booking booking, BindingResult result, @PathVariable("id") int id){
        booking.setCars_id(id);
        bookingService.save(booking);
        return "redirect:/bookings";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Booking.class, new CustomDateEditor(dateFormat,true));
    }

}
