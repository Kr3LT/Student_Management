package com.student.ManagementApp.service;

import com.student.ManagementApp.model.Entity.department;
import com.student.ManagementApp.model.Entity.student;
import com.student.ManagementApp.model.Entity.teacher;
import com.student.ManagementApp.respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminService{
    private final studentRepository studentRepository;
    private final classRepository classRepository;
    private final scoreRepository scoreRepository;
    private final departmentRepository departmentRepository;
    private final subjectRepository subjectRepository;
    private final teacherRepository teacherRepository;

    @Autowired
    public adminService(studentRepository studentRepository, classRepository classRepository, scoreRepository scoreRepository, departmentRepository departmentRepository, subjectRepository subjectRepository, teacherRepository teacherRepository) {
        this.studentRepository = studentRepository;
        this.classRepository = classRepository;
        this.scoreRepository = scoreRepository;
        this.departmentRepository = departmentRepository;
        this.subjectRepository = subjectRepository;
        this.teacherRepository = teacherRepository;
    }

    public List<department> getAllDepartement() {
        List<department> AllDepart = departmentRepository.findAll();
        return AllDepart;
    }

    public List<teacher> getAllTeacher() {
        List<teacher> AllTeacher = teacherRepository.findAll();
        return AllTeacher;
    }

    public List<student> getAllStudent() {
        List<student> AllStudent = studentRepository.findAll();
        return AllStudent;
    }

}
