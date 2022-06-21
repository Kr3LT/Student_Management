package com.student.ManagementApp.model.Entity;

import javax.persistence.*;
import java.util.*;

@Entity(name = "Student")
@Table(name = "student")
public class student {
    @Id
    private String sid;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date dateofbirth;
    @Column
    private boolean gender;
    @ManyToOne
    @JoinColumn(name = "cid")
    private studentclass studentclass;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<scores> scores;

    public student() {
    }
    public student(String sid, String firstName, String lastName) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public student(String sid, String firstName, String lastName, Date dateofbirth, boolean gender) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
    }

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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public com.student.ManagementApp.model.Entity.studentclass getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(com.student.ManagementApp.model.Entity.studentclass studentclass) {
        this.studentclass = studentclass;
    }

    public Collection<com.student.ManagementApp.model.Entity.scores> getScores() {
        return scores;
    }

    public void setScores(Collection<com.student.ManagementApp.model.Entity.scores> scores) {
        this.scores = scores;
    }
}
