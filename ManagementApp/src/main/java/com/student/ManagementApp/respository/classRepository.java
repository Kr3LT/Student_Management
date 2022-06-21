package com.student.ManagementApp.respository;


import com.student.ManagementApp.model.Entity.studentclass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface classRepository extends JpaRepository<studentclass, String> {
}
