package com.goon.placement_management_system.repository;

import com.goon.placement_management_system.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface StudentRepository extends JpaRepository<StudentProfile, Long> {
    Optional<StudentProfile> findByUserId(Long userId);
    @Query("SELECT COUNT(s) FROM StudentProfile s")
    long countTotalStudents();

    @Query("SELECT COUNT(s) FROM StudentProfile s WHERE s.placementStatus = 'PLACED'")
    long countPlacedStudents();

    @Query("SELECT AVG(s.cgpa) FROM StudentProfile s")
    Double getAverageCgpa();
}

