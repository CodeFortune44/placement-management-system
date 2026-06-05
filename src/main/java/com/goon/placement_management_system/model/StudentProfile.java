package com.goon.placement_management_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branch;
    private Integer year;
    private Double cgpa; // Core variable for the eligibility tracking engine
    private String skills; // Comma-separated tags (e.g., "Java, SQL")
    private String resumeUrl;
    private String placementStatus; // e.g., "UNPLACED", "PLACED"

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user; // Links this performance profile to a specific login account

    // Default Constructor
    public StudentProfile() {
    }

    // Parameterized Constructor
    public StudentProfile(Long id, String branch, Integer year, Double cgpa,
                   String skills, String resumeUrl, String placementStatus, User user) {
        this.id = id;
        this.branch = branch;
        this.year = year;
        this.cgpa = cgpa;
        this.skills = skills;
        this.resumeUrl = resumeUrl;
        this.placementStatus = placementStatus;
        this.user = user;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Double getCgpa() { return cgpa; }
    public void setCgpa(Double cgpa) { this.cgpa = cgpa; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public String getResumeUrl() { return resumeUrl; }
    public void setResumeUrl(String resumeUrl) { this.resumeUrl = resumeUrl; }

    public String getPlacementStatus() { return placementStatus; }
    public void setPlacementStatus(String placementStatus) { this.placementStatus = placementStatus; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}