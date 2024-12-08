package com.example.visitormanagement.repository;

import com.example.visitormanagement.entity.Visitor;
import com.example.visitormanagement.entity.VisitorTimeOut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<VisitorTimeOut, Integer> {
}
