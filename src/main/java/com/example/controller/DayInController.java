package com.example.controller;

import com.example.entity.DayIn;
import com.example.service.DayInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dayin")
public class DayInController {
    @Autowired
    private DayInService service;

    @GetMapping("/all")
    public List<DayIn> findAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public DayIn save(@RequestBody DayIn dayIn){
        service.save(dayIn);
        return dayIn;
    }
}
