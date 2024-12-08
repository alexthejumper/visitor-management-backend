package com.example.visitormanagement.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VisitorResponse {

    private Long id;
    private String departureTime;

    public VisitorResponse(Long id, String name, String departureTime) {
        this.id = id;
        this.departureTime = departureTime;
    }
}
