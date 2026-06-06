package com.goon.placement_management_system.service;

import com.goon.placement_management_system.model.JobApplication;
import com.goon.placement_management_system.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository applicationRepository;

    public JobApplication applyToCompany(JobApplication application) {
        application.setStatus("APPLIED");
        return applicationRepository.save(application);
    }

    public List<JobApplication> getStudentApplications(Long studentId) {
        return applicationRepository.findByStudentProfileId(studentId);
    }

    public JobApplication updateStatus(Long applicationId, String status) {
        JobApplication app = applicationRepository.findById(applicationId)
                .orElseThrow(() -> new RuntimeException("Application not found"));
        app.setStatus(status);
        return applicationRepository.save(app);
    }
}