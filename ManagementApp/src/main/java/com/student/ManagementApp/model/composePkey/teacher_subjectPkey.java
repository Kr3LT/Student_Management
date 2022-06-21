package com.student.ManagementApp.model.composePkey;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class teacher_subjectPkey implements Serializable {
    @ManyToOne
    @JoinColumn(name = "tid")
    private com.student.ManagementApp.model.Entity.teacher teacher;
    @ManyToOne
    @JoinColumn(name = "sjid")
    private com.student.ManagementApp.model.Entity.subject subject;
}
