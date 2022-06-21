package com.student.ManagementApp.respository;


import com.student.ManagementApp.model.Entity.studentclass;
import com.student.ManagementApp.model.Entity.teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teacherRepository extends JpaRepository<teacher, String> {
}
