package com.reservation.car_reservation.repository;

import com.reservation.car_reservation.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
