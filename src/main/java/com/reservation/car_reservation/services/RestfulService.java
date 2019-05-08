package com.reservation.car_reservation.services;

import com.reservation.car_reservation.models.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestfulService {
    RestTemplate restTemplate;
    public RestfulService(){
        restTemplate = new RestTemplate();
    }

    public void getEntity(){
        System.out.println("Begin Retrieving API");
        String getUrl = "https://localhost:44361/api/cars";
        ResponseEntity<Car> getResponse = restTemplate.getForEntity(getUrl,Car.class);
    }
}
