package com.student.ManagementApp.model.Entity;


import com.student.ManagementApp.model.composePkey.teacher_subjectPkey;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "teacher_subject")
@Table (name = "teacher_subject")
@IdClass(teacher_subjectPkey.class)
public class teacher_subject {
    @Id
    @ManyToOne
    @JoinColumn(name = "tid")
    @Autowired
    private teacher teacher;
    @Id
    @ManyToOne
    @JoinColumn(name = "sjid")
    @Autowired
    private subject subject;
    @Column
    private Date startDate;
}
