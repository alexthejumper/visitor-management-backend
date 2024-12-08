package com.example.visitormanagement.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SignOutResponse {

    private String fName;
    private String lName;
    private LocalDateTime departureTime;

    public SignOutResponse(String fName, String lName, LocalDateTime departureTime) {
        this.fName = fName;
        this.lName = lName;
        this.departureTime = departureTime;
    }
}
