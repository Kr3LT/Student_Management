package com.student.ManagementApp.model.Entity;

import com.student.ManagementApp.model.composePkey.scorePkey;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity(name = "Scores")
@Table(name = "scores")
@IdClass(scorePkey.class)
public class scores {
    @Id
    @ManyToOne
    @JoinColumn(name = "sid")
    @Autowired
    private student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "sjid")
    @Autowired
    private subject subject;

    @Column
    private Double firstTest;
    @Column
    private Double secondTest;
    @Column
    private Integer timeToPass;

    public scores() {
    }

    public scores(student student, subject subject, Double firstTest, Double secondTest) {
        this.student = student;
        this.subject = subject;
        this.firstTest = firstTest;
        this.secondTest = secondTest;
    }

    public student getstudent() {
        return student;
    }

    public void setstudent(student student) {
        this.student = student;
    }

    public subject getSubject() {
        return subject;
    }

    public void setSubject(subject subject) {
        this.subject = subject;
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
