package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/all")
    public List<User> findAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public User save(@RequestBody User user){
        service.save(user);
        return user;
    }


}
