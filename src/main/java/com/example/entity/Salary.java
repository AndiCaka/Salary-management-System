package com.example.entity;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Salary {

    @Autowired
    private UserRepository userRepo;
    public Response response;

    private int id;
    private String firstName;
    private String lastName;
    private double hour_in;
    private double hour_out;
    private double total_amount;

    public void calculateSalary() {

        double hour_amount = response.getSalary()/22;

        for(int i = 0;i<userRepo.nameDate().size();i++){
            for( int j = 0; j<userRepo.dayOff().size();j++){
                if (response.getDate().isEqual(response.getDate_off())){
                    if (response.getHour()>8){
                        hour_out = response.getHour()-8;
                        hour_in=8;
                    }else {
                        hour_out=0;
                        hour_in=response.getHour();
                    }
                    total_amount = (hour_in*hour_amount*1.5)+(hour_out*hour_amount*2);
                } else{
                    if (response.getHour()>8){
                        hour_out = response.getHour()-8;
                        hour_in=8;
                    }else {
                        hour_out=0;
                        hour_in=response.getHour();
                    }
                    total_amount = (hour_in*hour_amount*1)+(hour_out*hour_amount*1.25);
                }
            }
        }
    }

    public Salary(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
