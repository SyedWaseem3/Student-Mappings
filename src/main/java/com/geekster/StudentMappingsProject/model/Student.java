package com.geekster.StudentMappingsProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentAge;
    private String studentNumber;
    @Enumerated(value = EnumType.STRING)
    private Branch studentBranch;
    @Enumerated(value = EnumType.STRING)
    private Department studentDepartment;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    @OneToMany
    @JoinColumn(name = "fk_course_id")
    List<Course> courses;
}
