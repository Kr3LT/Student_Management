package com.student.ManagementApp.controller;



import com.student.ManagementApp.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/student")
public class studentController {

    private final studentService studentService;
    @Autowired
    public studentController (studentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/check")
    public String checkStatus(){
        return "Working...";
    }

    @GetMapping("/classmate")
    public ResponseEntity getAllStudentFromClass(@RequestParam String classId){
        return studentService.getStudentsFromClass(classId);
    }

    @GetMapping("/subject")
    public ResponseEntity getScoresOfSubject(@RequestParam String sjId,@RequestParam String sid){
        return studentService.getScoresOfSubject(sid, sjId);
    }









}
