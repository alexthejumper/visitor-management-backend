package com.example.visitormanagement.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fName;
    private String lName;
    private String status;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Visitor() {}

    public Visitor(Long id, String fName, String lname, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.id = id;
        this.fName = fName;
        this.lName = lname;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}
