package com.cnitv.trading.controllers;

import com.cnitv.trading.models.User;
import com.cnitv.trading.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/state")
    public User getUser() {
        log.info("get request for user");
        return userService.getDefaultUser();
    }

    @GetMapping("/increment/{addition}")
    public User getIncrementedUser(@PathVariable Integer addition) {
        User user = userService.incrementUserAge(addition);
        log.info("get request for incrementing user {}", user);
        return user;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User userInput) {
        return userService.addUser(userInput);
    }


}
