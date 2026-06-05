package com.goon.placement_management_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private Double minCgpa; // The threshold criteria for eligibility checking
    private String requiredSkill; // The technical skill tag needed

    public Company() {}

    public Company(Long id, String companyName, Double minCgpa, String requiredSkill) {
        this.id = id;
        this.companyName = companyName;
        this.minCgpa = minCgpa;
        this.requiredSkill = requiredSkill;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public Double getMinCgpa() { return minCgpa; }
    public void setMinCgpa(Double minCgpa) { this.minCgpa = minCgpa; }

    public String getRequiredSkill() { return requiredSkill; }
    public void setRequiredSkill(String requiredSkill) { this.requiredSkill = requiredSkill; }
}
