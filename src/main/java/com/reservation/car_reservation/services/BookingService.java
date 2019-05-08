package com.reservation.car_reservation.services;

import com.reservation.car_reservation.models.Booking;
import com.reservation.car_reservation.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository){ this.bookingRepository = bookingRepository; }

    public List<Booking> findAll(){
        List<Booking> bookings = new ArrayList<>();
        bookingRepository.findAll().forEach(bookings::add);
        return bookings;
    }

    public void save(Booking booking){
        bookingRepository.save(booking);
    }

    public void delete(Booking booking){
        this.bookingRepository.delete(booking);
    }
}
