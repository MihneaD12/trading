package com.cnitv.trading.services;

import com.cnitv.trading.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getDefaultUser() {
        return User.builder()
                .age(23)
                .email("emai@email.com")
                .name("andrei")
                .build();
    }

    public User incrementUserAge(Integer ageIncrement) {
        User user = getDefaultUser();
        user.setAge(user.getAge() + ageIncrement);
        return user;
    }

    public User addUser(User user) {
        return updateUser(user);
    }

    private User updateUser(User user) {
        return User.builder()
                .name(user.getName())
                .email(user.getEmail())
                .age(user.getAge())
                .build();
    }

}
