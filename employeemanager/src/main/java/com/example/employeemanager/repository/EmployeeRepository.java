package com.example.employeemanager.repository;

import com.example.employeemanager.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Optional<Employee> getEmployeeById(Long id);

    void findByNomContaining(String filter);
}
