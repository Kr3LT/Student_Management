package com.student.ManagementApp.respository;

import com.student.ManagementApp.model.Entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepository extends JpaRepository<student, String> {
    public List<student> findAllByStudentclass_Cid(String cid);
}
