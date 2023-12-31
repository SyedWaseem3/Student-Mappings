package com.geekster.StudentMappingsProject.repo;

import com.geekster.StudentMappingsProject.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {
}
