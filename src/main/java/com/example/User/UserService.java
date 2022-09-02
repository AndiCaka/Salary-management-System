package com.example.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

