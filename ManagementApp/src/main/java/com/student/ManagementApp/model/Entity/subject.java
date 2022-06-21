package com.student.ManagementApp.model.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "Subject")
@Table(name = "subject")
public class subject {
    @Id
    private String sjid;
    @Column
    private String subjectName;
    @Column
    private Integer credits;

    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<scores> scores;
    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<teacher_subject> teachers;

    public subject() {
    }

    public subject(String sjid, String subjectName, Integer credits) {
        this.sjid = sjid;
        this.subjectName = subjectName;
        this.credits = credits;
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
}
