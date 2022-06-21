package com.student.ManagementApp.respository;


import com.student.ManagementApp.model.Entity.subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface subjectRepository extends JpaRepository<subject, String> {
}
