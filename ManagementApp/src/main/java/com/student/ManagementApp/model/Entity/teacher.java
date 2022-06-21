package com.student.ManagementApp.model.Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity(name = "teacher")
@Table(name = "teacher")
public class teacher {
    @Id
    private String tid;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date dateofbirth;
    @Column
    private boolean gender;
    @ManyToOne
    @JoinColumn(name = "did")
    private com.student.ManagementApp.model.Entity.department department;
    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<teacher_subject> subjects;




}
