package com.geekster.StudentMappingsProject.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    @ManyToMany
            @JoinTable(name = "course_student_ids",
            joinColumns = @JoinColumn(name = "fk_course_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_student_id"))
    List<Student> students;
}
