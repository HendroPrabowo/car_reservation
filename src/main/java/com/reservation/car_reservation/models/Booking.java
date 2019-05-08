package com.reservation.car_reservation.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;

@Entity(name = "booking")
public class Booking {
    @Id
    private int id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date booking_start;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date booking_end;

    private String booking_permission;
    private int booking_status;
    private int cars_id;
    private int users_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBooking_start() {
        return booking_start;
    }

    public void setBooking_start(Date booking_start) {
        this.booking_start = booking_start;
    }

    public Date getBooking_end() {
        return booking_end;
    }

    public void setBooking_end(Date booking_end) {
        this.booking_end = booking_end;
    }

    public String getBooking_permission() {
        return booking_permission;
    }

    public void setBooking_permission(String booking_permission) {
        this.booking_permission = booking_permission;
    }

    public int getBooking_status() {
        return booking_status;
    }

    public void setBooking_status(int booking_status) {
        this.booking_status = booking_status;
    }

    public int getCars_id() {
        return cars_id;
    }

    public void setCars_id(int cars_id) {
        this.cars_id = cars_id;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }
}
