package com.reservation.car_reservation.repository;

import com.reservation.car_reservation.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
