package com.example.service;

import com.example.repository.DayInRepository;
import com.example.entity.DayIn;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DayInService {
    @Autowired
    private DayInRepository repo;

    public List<DayIn> findAll(){
        return (List<DayIn>) repo.findAll();
    }

    public void save(DayIn dayIn){
        repo.save(dayIn);
    }
}
