package com.student.ManagementApp.respository;

import com.student.ManagementApp.model.Entity.department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departmentRepository extends JpaRepository<department, String> {
}
