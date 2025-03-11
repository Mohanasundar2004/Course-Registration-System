package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Model.Coursesystem;
import com.example.Course.Registration.System.Service.CoursesystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CoursesystemController {
    @Autowired
    CoursesystemService coursesystemService;
    @GetMapping("courses")
    public List<Coursesystem> availableCourses(){
        return coursesystemService.availableCourses();
    }
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return coursesystemService.enrolledStudents();
    }
    @PostMapping("courses/register")
    public String courseregister(@RequestParam("username")String username,
                                 @RequestParam("emailId")String emailId,
                                 @RequestParam("coursename") String coursename){
        coursesystemService.courseregister(username,emailId,coursename);
        return "Congratulations! "+username+" Enrollement Successful for "+coursename;
    }
}
