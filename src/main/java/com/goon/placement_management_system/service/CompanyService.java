package com.goon.placement_management_system.service;

import com.goon.placement_management_system.model.Company;
import com.goon.placement_management_system.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public List<Company> getEligibleCompaniesForStudent(Double studentCgpa, String studentSkills) {
        return companyRepository.findEligibleCompanies(studentCgpa, studentSkills);
    }
}