package com.example.repository;

import com.example.entity.User;
import com.example.salary.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select new com.example.salary.Response(u.firstName,u.lastName,d.date,u.salary,d.hour) from User u JOIN u.dayInList d")
    public List<Response> nameDate();

    @Query("Select new com.example.salary.Response(d.date_off) from DayOut d ")
    public List<Response> dayOff();

}
