package com.example.day_out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOutRepository extends JpaRepository<DayOut, Long> {

}
