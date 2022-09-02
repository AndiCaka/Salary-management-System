package com.example.repository;

import com.example.entity.DayIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DayInRepository extends JpaRepository<DayIn, Long> {

    @Query("SELECT d FROM DayIn d WHERE "
            + " CONCAT(d.userId,' ', d.date, ' ',d.hour) "
            + " LIKE %?1%")
    public List<DayIn> dayInList(String keyword);
}
