package com.example.service;

import com.example.repository.UserRepository;
import com.example.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return (List<User>) repo.findAll();
    }

    public void save(User user){
        repo.save(user);
    }




}

