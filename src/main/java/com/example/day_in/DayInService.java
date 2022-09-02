package com.example.day_in;

import com.example.User.User;
import com.example.User.UserRepository;
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
