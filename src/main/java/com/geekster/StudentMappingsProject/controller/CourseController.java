package com.geekster.StudentMappingsProject.controller;

import com.geekster.StudentMappingsProject.model.Course;
import com.geekster.StudentMappingsProject.model.Student;
import com.geekster.StudentMappingsProject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course newCourse){
        return courseService.addCourse(newCourse);
    }

    @GetMapping("courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PutMapping("updateCourseDurationById/{id}/duration/{duration}")
    public String updateCourseDurationById(@PathVariable Long id, @PathVariable String duration){
        return courseService.updateCourseDurationById(id,duration);
    }

    @DeleteMapping("deleteCourseById/{id}")
    public String deleteCourseById(@PathVariable Long id){
        return courseService.deleteCourseById(id);
    }
}
