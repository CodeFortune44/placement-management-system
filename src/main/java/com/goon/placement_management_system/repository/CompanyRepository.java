package com.goon.placement_management_system.repository;

import com.goon.placement_management_system.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    // Core Engine Logic: Filters companies based on dynamic real-time CGPA and Skill matching
    @Query("SELECT c FROM Company c WHERE c.minCgpa <= :studentCgpa AND :studentSkills LIKE CONCAT('%', c.requiredSkill, '%')")
    List<Company> findEligibleCompanies(@Param("studentCgpa") Double studentCgpa, @Param("studentSkills") String studentSkills);
}