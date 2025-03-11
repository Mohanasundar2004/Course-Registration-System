package com.example.Course.Registration.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coursesystem {
    @Id
    private String courseId;
    private String coursename;
    private String trainer;
    private int durationInweek;

    public Coursesystem(String courseId, String coursename, String trainer, int durationInweek) {
        this.courseId = courseId;
        this.coursename = coursename;
        this.trainer = trainer;
        this.durationInweek = durationInweek;
    }

    public Coursesystem() {
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationInweek() {
        return durationInweek;
    }

    public void setDurationInweek(int durationInweek) {
        this.durationInweek = durationInweek;
    }
}
