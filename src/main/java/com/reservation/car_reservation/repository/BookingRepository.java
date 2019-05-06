package com.reservation.car_reservation.repository;

import com.reservation.car_reservation.models.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
}
