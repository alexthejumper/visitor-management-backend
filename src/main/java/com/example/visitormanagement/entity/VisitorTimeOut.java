package com.example.visitormanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class VisitorTimeOut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String visitor_fname;
    private String visitor_lname;
    private LocalDateTime timeout;

    public VisitorTimeOut() {}

    public VisitorTimeOut(String fname, String lname, LocalDateTime timeout) {
        this.visitor_fname = fname;
        this.visitor_lname = lname;
        this.timeout = timeout;
    }
}
