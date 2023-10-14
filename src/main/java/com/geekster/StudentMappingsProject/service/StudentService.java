package com.geekster.StudentMappingsProject.service;

import com.geekster.StudentMappingsProject.model.Student;
import com.geekster.StudentMappingsProject.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return newStudent.getStudentName() + " student added!";
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public String updateStudentNumberById(Long id, String number) {
        Student student = studentRepo.findById(id).orElseThrow();
        student.setStudentNumber(number);
        studentRepo.save(student);
        return "Student's number updated!";
    }

    public String deleteStudentById(Long id) {
        studentRepo.deleteById(id);
        return "Student deleted!";
    }
}
