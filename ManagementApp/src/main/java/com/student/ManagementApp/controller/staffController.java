package com.student.ManagementApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff/")
public class staffController {

    @GetMapping()
    public String checkStatus() {
        return "Working...";
    }
}
