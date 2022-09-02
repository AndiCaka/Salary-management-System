package com.example.controller;

import com.example.entity.DayOut;
import com.example.service.DayOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dayout")
public class DayOutController {
    @Autowired
    private DayOutService service;

    @GetMapping("/all")
    public List<DayOut> findAll(){
        return service.findAll();
    }

    @PostMapping("/add")
    public DayOut save(@RequestBody DayOut dayOut){
        service.save(dayOut);
        return dayOut;
    }
}
