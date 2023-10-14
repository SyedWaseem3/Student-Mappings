package com.geekster.StudentMappingsProject.repo;

import com.geekster.StudentMappingsProject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course, Long> {
}
