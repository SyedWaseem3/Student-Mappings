package com.geekster.StudentMappingsProject.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookAuthor;
    private String bookDescription;
    private Integer bookPrice;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;
}
