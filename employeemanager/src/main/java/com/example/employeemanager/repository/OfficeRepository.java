package com.example.employeemanager.repository;

import com.example.employeemanager.model.Office;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OfficeRepository extends JpaRepository<Office,Long> {
}
