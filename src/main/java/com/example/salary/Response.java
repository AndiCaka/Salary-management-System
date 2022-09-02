package com.example.salary;

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

    private String firstName;
    private String lastName;
    private LocalDate date;
    private double salary;
    private int hour;

    private LocalDate date_off;

    private double hour_amount;
    private int hour_in;
    private int hour_out;
    private double total_amount;

    public void calculateSalary() {
        hour_amount = salary/22;

        for(int i = 0;i<userRepo.nameDate().size();i++){
            for( int j = 0; j<userRepo.dayOff().size();j++){
                if (date.isEqual(date_off)){
                    if (hour>8){
                        hour_out = hour-8;
                        hour_in=8;
                    }else {
                        hour_out=0;
                        hour_in=hour;
                    }
                    total_amount = (hour_in*hour_amount*1)+(hour_out*hour_amount*1.25);
                }else{
                    if (hour>8){
                        hour_out = hour-8;
                        hour_in=8;
                    }else {
                        hour_out=0;
                        hour_in=hour;
                    }
                    total_amount = (hour_in*hour_amount*1.5)+(hour_out*hour_amount*2);
                }
            }
        }
    }






    public Response(String firstName, String lastName, LocalDate date, int salary, int hour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.salary = salary;
        this.hour = hour;
    }
    public Response(LocalDate date_off) {
        this.date_off = date_off;
    }


}




