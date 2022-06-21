package com.student.ManagementApp.model.composePkey;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class scorePkey implements Serializable {
    @ManyToOne
    @JoinColumn(name = "sid")
    private com.student.ManagementApp.model.Entity.student student;
    @ManyToOne
    @JoinColumn(name = "sjid")
    private com.student.ManagementApp.model.Entity.subject subject;
}
