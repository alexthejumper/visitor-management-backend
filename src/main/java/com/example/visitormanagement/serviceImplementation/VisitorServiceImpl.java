package com.example.visitormanagement.serviceImplementation;

import com.example.visitormanagement.dto.SignOutResponse;
import com.example.visitormanagement.dto.VisitorResponse;
import com.example.visitormanagement.entity.Visitor;
import com.example.visitormanagement.entity.VisitorTimeOut;
import com.example.visitormanagement.repository.VisitorRepository;
import com.example.visitormanagement.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import java.time.LocalDateTime;

@Service
public class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository visitorRepository;

    @Autowired
    public VisitorServiceImpl(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @Override
    public void signOutVisitor(SignOutResponse signOutResponseDTO) {

        VisitorTimeOut visitor = new VisitorTimeOut();

        visitor.setVisitor_fname(signOutResponseDTO.getFName());
        visitor.setVisitor_lname(signOutResponseDTO.getLName());
        visitor.setTimeout(signOutResponseDTO.getDepartureTime());

        System.out.println(signOutResponseDTO.getFName());

        System.out.println(visitor.getVisitor_fname() + " " + visitor.getVisitor_lname() + " " + visitor.getTimeout());

        visitorRepository.save(visitor);
    }

    @Override
    public Page<VisitorResponse> findAllVisitors(Pageable pageable) {
        // Add your logic here if needed for pagination
        return null;
    }
}
