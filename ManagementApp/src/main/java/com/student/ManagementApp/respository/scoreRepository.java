package com.student.ManagementApp.respository;

import com.student.ManagementApp.model.Entity.scores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface scoreRepository extends JpaRepository<scores, String> {
    List<scores> findAllBysidAndsjid(String sid, String sjid);
}
