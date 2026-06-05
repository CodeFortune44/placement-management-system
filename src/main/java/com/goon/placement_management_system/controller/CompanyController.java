package com.goon.placement_management_system.controller;

import com.goon.placement_management_system.model.Company;
import com.goon.placement_management_system.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.saveCompany(company));
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies() {
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    // Fixed typo to @GetMapping
    @GetMapping("/eligible")
    public ResponseEntity<List<Company>> getEligibleCompanies(@RequestParam Double cgpa, @RequestParam String skills) {
        return ResponseEntity.ok(companyService.getEligibleCompaniesForStudent(cgpa, skills));
    }
}