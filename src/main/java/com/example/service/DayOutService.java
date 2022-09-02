package com.example.service;

import com.example.repository.DayOutRepository;
import com.example.entity.DayOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DayOutService {
    @Autowired
    private DayOutRepository repo;

    public List<DayOut> findAll(){
        return (List<DayOut>) repo.findAll();
    }

    public void save(DayOut dayOut){
        repo.save(dayOut);
    }
}
