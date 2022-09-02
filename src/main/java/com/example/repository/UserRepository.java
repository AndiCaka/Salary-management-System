package com.example.repository;

import com.example.entity.Salary;
import com.example.entity.User;
import com.example.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select new com.example.entity.Response(d.date,u.salary,d.hour) from User u JOIN u.dayInList d")
    public List<Response> nameDate();

    @Query("Select new com.example.entity.Salary(u.firstName,u.lastName) from User u")
    public List<Salary> fullName();

    @Query("Select new com.example.entity.Response(d.date_off) from DayOut d ")
    public List<Response> dayOff();

}
