package com.example.visitormanagement.controller;

import com.example.visitormanagement.dto.SignOutResponse;
import com.example.visitormanagement.service.VisitorService;
import com.example.visitormanagement.serviceImplementation.VisitorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // Allow CORS for Angular frontend
public class VisitorController {
    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @PostMapping("/sign-out")
    public ResponseEntity<Void> signOut(@RequestBody SignOutResponse signOutResponse) {
        visitorService.signOutVisitor(signOutResponse);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
