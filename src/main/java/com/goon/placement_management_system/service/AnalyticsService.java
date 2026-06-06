package com.goon.placement_management_system.service;

import com.goon.placement_management_system.model.DashboardStatsDTO;
import com.goon.placement_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    @Autowired
    private StudentRepository studentRepository;

    public DashboardStatsDTO getDashboardStats() {
        long total = studentRepository.countTotalStudents();
        long placed = studentRepository.countPlacedStudents();
        long unplaced = total - placed;

        double rate = total == 0 ? 0.0 : ((double) placed / total) * 100;
        Double avgCgpaRaw = studentRepository.getAverageCgpa();
        double avgCgpa = avgCgpaRaw == null ? 0.0 : avgCgpaRaw;

        return new DashboardStatsDTO(total, placed, unplaced, rate, avgCgpa);
    }
}
