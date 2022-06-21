package com.student.ManagementApp.model.DTO;

import com.student.ManagementApp.model.Entity.scores;
import com.student.ManagementApp.model.Entity.student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import java.util.Date;

public class student_subjectScoreDTO {
    private String sid;
    private String firstName;
    private String lastName;
    private String sjid;
    private String subjectName;
    private Integer credits;
    private Double firstTest;
    private Double secondTest;
    private Integer timeToPass;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSjid() {
        return sjid;
    }

    public void setSjid(String sjid) {
        this.sjid = sjid;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Double getFirstTest() {
        return firstTest;
    }

    public void setFirstTest(Double firstTest) {
        this.firstTest = firstTest;
    }

    public Double getSecondTest() {
        return secondTest;
    }

    public void setSecondTest(Double secondTest) {
        this.secondTest = secondTest;
    }

    public Integer getTimeToPass() {
        return timeToPass;
    }

    public void setTimeToPass(Integer timeToPass) {
        this.timeToPass = timeToPass;
    }

}
