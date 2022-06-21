package com.student.ManagementApp.controller;

import com.student.ManagementApp.model.Entity.department;
import com.student.ManagementApp.model.Entity.student;
import com.student.ManagementApp.model.Entity.teacher;
import com.student.ManagementApp.service.adminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/")
public class adminController {
    adminService adminService;
    public adminController(adminService adminService){
        this.adminService = adminService;
    }

    @GetMapping()
    public String checkStatus() {
        return "Working...";
    }
    @GetMapping(path = "department")
    public List<department> getAllDepartment(){
        return adminService.getAllDepartement();
    }
    @GetMapping(path = "teacher")
    public List<teacher> getAllTeacher(){
        return adminService.getAllTeacher();
    }
    @GetMapping(path = "student")
    public List<student> getAllStudent(){
        return adminService.getAllStudent();
    }


}
