package com.example.repository;

import com.example.entity.DayOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOutRepository extends JpaRepository<DayOut, Long> {

}
