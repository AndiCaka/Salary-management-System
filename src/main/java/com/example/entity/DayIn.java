package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "day_in")
@Getter
@Setter
@NoArgsConstructor
public class DayIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(length = 45, nullable = false, name = "date")
    private LocalDate date;

    @Column(nullable = false, name = "hour")
    private int hour;
}