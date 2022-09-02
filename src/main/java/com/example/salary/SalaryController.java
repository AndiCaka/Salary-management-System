package com.example.salary;

import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/nameDate")
    public List<Response> nameDate(){
        return userRepo.nameDate();
    }

    @GetMapping("/dayOff")
    public List<Response> dayOff(){
        return userRepo.dayOff();
    }

}
