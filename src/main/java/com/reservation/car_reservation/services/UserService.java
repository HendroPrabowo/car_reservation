package com.reservation.car_reservation.services;

import com.reservation.car_reservation.models.User;
import com.reservation.car_reservation.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        List<User> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);

        return user;
    }

    public User findOne(int id){
        return userRepository.findById(id).get();
    }

    public User login(String username, String password){
        List<User> users = this.findAll();
        for(User user : users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public void save(User user){
        userRepository.save(user);
    }
}
