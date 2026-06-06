package com.goon.placement_management_system.model;

public class DashboardStatsDTO {
    private long totalStudents;
    private long placedStudents;
    private long unplacedStudents;
    private double placementRate;
    private double averageCgpa;

    public DashboardStatsDTO(long totalStudents, long placedStudents, long unplacedStudents, double placementRate, double averageCgpa) {
        this.totalStudents = totalStudents;
        this.placedStudents = placedStudents;
        this.unplacedStudents = unplacedStudents;
        this.placementRate = placementRate;
        this.averageCgpa = averageCgpa;
    }

    // Getters
    public long getTotalStudents() { return totalStudents; }
    public long getPlacedStudents() { return placedStudents; }
    public long getUnplacedStudents() { return unplacedStudents; }
    public double getPlacementRate() { return placementRate; }
    public double getAverageCgpa() { return averageCgpa; }
}
