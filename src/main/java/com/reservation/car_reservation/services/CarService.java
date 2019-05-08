package com.reservation.car_reservation.services;
import com.reservation.car_reservation.models.Car;
import com.reservation.car_reservation.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll(){
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(cars::add);
        return cars;
    }

    public Car findOne(int id){
        return carRepository.findById(id).get();
    }

    public void save(Car car){
        carRepository.save(car);
    }

    public void delete(int id){
        carRepository.deleteById(id);
    }
}
