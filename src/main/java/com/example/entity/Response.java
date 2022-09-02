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
    private int hour;

    private LocalDate date_off;

//    private double hour_amount;
//    private int hour_in;
//    private int hour_out;
//    private double total_amount;


    public Response(LocalDate date, int salary, int hour) {
        this.date = date;
        this.salary = salary;
        this.hour = hour;
    }
    public Response(LocalDate date_off) {
        this.date_off = date_off;
    }


}




