package com.example.entity;

import com.example.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Response {

    @Autowired
    private UserRepository userRepo;

    private LocalDate date;
    private double salary;

    private LocalDate date_off;


    public Response(LocalDate date, int salary) {
        this.date = date;
        this.salary = salary;
    }
    public Response(LocalDate date_off) {
        this.date_off = date_off;
    }


}




