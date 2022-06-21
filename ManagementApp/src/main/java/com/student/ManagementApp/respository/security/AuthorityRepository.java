package com.student.ManagementApp.respository.security;

import com.student.ManagementApp.model.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
