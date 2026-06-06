package com.goon.placement_management_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "job_applications")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_profile_id", nullable = false)
    private StudentProfile studentProfile;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    private String status; // APPLIED, INTERVIEWING, PLACED, REJECTED

    public JobApplication() {}

    public JobApplication(StudentProfile studentProfile, Company company, String status) {
        this.studentProfile = studentProfile;
        this.company = company;
        this.status = status;
    }

    public Long getId() { return id; }
    public StudentProfile getStudentProfile() { return studentProfile; }
    public void setStudentProfile(StudentProfile studentProfile) { this.studentProfile = studentProfile; }
    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
