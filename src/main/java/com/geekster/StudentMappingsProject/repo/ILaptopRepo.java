package com.geekster.StudentMappingsProject.repo;

import com.geekster.StudentMappingsProject.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop, Long> {
}
