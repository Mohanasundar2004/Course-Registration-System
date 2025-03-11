package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Model.Coursesystem;
import com.example.Course.Registration.System.Repository.CourseRegistryRepo;
import com.example.Course.Registration.System.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesystemService {
    @Autowired
    Repo repo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Coursesystem> availableCourses() {
        return repo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void courseregister(String username, String emailId, String coursename) {
        CourseRegistry courseRegistry=new CourseRegistry(username,emailId,coursename);
        courseRegistryRepo.save(courseRegistry);
    }
}
