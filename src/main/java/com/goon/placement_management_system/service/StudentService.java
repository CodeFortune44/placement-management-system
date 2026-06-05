package com.goon.placement_management_system.service;

import com.goon.placement_management_system.model.StudentProfile;
import com.goon.placement_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentProfile saveOrUpdateStudent(StudentProfile student) {
        return studentRepository.save(student);
    }

    public Optional<StudentProfile> getStudentByUserId(Long userId) {
        return studentRepository.findByUserId(userId);
    }
}
