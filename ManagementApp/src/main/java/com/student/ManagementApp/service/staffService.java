package com.student.ManagementApp.service;

import com.student.ManagementApp.respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class staffService{

    private final studentRepository studentRepository;
    private final classRepository classRepository;
    private final scoreRepository scoreRepository;
    private final departmentRepository departmentRepository;
    private final subjectRepository subjectRepository;

    @Autowired
    public staffService(com.student.ManagementApp.respository.studentRepository studentRepository, com.student.ManagementApp.respository.classRepository classRepository, com.student.ManagementApp.respository.scoreRepository scoreRepository, com.student.ManagementApp.respository.departmentRepository departmentRepository, com.student.ManagementApp.respository.subjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.classRepository = classRepository;
        this.scoreRepository = scoreRepository;
        this.departmentRepository = departmentRepository;
        this.subjectRepository = subjectRepository;
    }
}
