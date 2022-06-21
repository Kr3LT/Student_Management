package com.student.ManagementApp.model.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "StudentClass")
@Table(name = "studentclass")
public class studentclass {
    @Id
    private String cid;
    @Column
    private String className;
    @Column
    private Integer courseNum;
    @Column
    private String trainType;
    @Column
    private Integer enrollYear;
    @Column
    private Integer numOfStudent;
    @OneToMany(mappedBy = "studentclass",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<student> students = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "did")
    private department department;



    public studentclass() {
    }

    public studentclass(String cid, String className, Integer courseNum, String trainType, Integer enrollYear, Integer numOfStudent) {
        this.cid = cid;
        this.className = className;
        this.courseNum = courseNum;
        this.trainType = trainType;
        this.enrollYear = enrollYear;
        this.numOfStudent = numOfStudent;
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

    public Set<student> getStudents() {
        return students;
    }

    public void setStudents(Set<student> students) {
        this.students = students;
    }

    public com.student.ManagementApp.model.Entity.department getDepartment() {
        return department;
    }

    public void setDepartment(com.student.ManagementApp.model.Entity.department department) {
        this.department = department;
    }
}
