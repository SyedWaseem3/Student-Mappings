package com.geekster.StudentMappingsProject.controller;

import com.geekster.StudentMappingsProject.model.Student;
import com.geekster.StudentMappingsProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PutMapping("updateStudentNumberById/{id}/number/{number}")
    public String updateStudentNumberById(@PathVariable Long id, @PathVariable String number){
        return studentService.updateStudentNumberById(id,number);
    }

    @DeleteMapping("deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }
}
