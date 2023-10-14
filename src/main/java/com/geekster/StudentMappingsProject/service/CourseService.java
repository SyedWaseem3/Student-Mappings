package com.geekster.StudentMappingsProject.service;

import com.geekster.StudentMappingsProject.model.Course;
import com.geekster.StudentMappingsProject.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course newCourse) {
        courseRepo.save(newCourse);
        return "Course added!";
    }

    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public String updateCourseDurationById(Long id, String duration) {
        Course course = courseRepo.findById(id).orElseThrow();
        course.setCourseDuration(duration);
        courseRepo.save(course);
        return "Course duration updated!";
    }

    public String deleteCourseById(Long id) {
        courseRepo.deleteById(id);
        return "Course deleted!";
    }
}
