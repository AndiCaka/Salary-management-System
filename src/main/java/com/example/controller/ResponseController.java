package com.example.controller;

import com.example.entity.Response;
import com.example.entity.Salary;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResponseController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/nameDate")
    public List<Response> nameDate(){
        return userRepo.nameDate();
    }

    @GetMapping("/nullname")
    public List<Salary> fullname(){
        return userRepo.fullName();
    }

    @GetMapping("/dayOff")
    public List<Response> dayOff(){
        return userRepo.dayOff();
    }
}
