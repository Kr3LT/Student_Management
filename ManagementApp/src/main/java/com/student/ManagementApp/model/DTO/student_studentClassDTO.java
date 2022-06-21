package com.student.ManagementApp.model.DTO;


import javax.persistence.Column;
import java.util.Date;

public class student_studentClassDTO {
    private String sid;
    private String firstName;
    private String lastName;
    private Date dateofbirth;
    private boolean gender;
    private String cid;
    private String className;
    private Integer courseNum;
    private String trainType;
    private Integer enrollYear;
    private Integer numOfStudent;

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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public Integer getEnrollYear() {
        return enrollYear;
    }

    public void setEnrollYear(Integer enrollYear) {
        this.enrollYear = enrollYear;
    }

    public Integer getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(Integer numOfStudent) {
        this.numOfStudent = numOfStudent;
    }
}
