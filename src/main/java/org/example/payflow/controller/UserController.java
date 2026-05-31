package org.example.payflow.controller;

import org.example.payflow.entity.User;
import org.example.payflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User registerUser(@RequestBody User user) {
        System.out.println(user);
        return userService.registerUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/upi/{upiId}")
    public User getByUpiId(@PathVariable String upiId) {
        return userService.findByUpiId(upiId);
    }

    @GetMapping("/balance/{amount}")
    public List<User> getUsersWithBalance(@PathVariable Double amount) {
        return userService.getUsersWithBalanceGreaterThan(amount);
    }
}