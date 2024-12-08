package com.example.visitormanagement.service;

import com.example.visitormanagement.dto.SignOutResponse;
import com.example.visitormanagement.dto.VisitorResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VisitorService {

    void signOutVisitor(SignOutResponse signOutResponseDTO);

    Page<VisitorResponse> findAllVisitors(Pageable pageable);
}
