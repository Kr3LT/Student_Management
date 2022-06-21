package com.student.ManagementApp.model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Department")
@Table(name = "department")
public class department {
    @Id
    private String did;
    @Column
    private String departmentName;
    @Column
    private String phone;

    public department() {
    }

    public department(String did, String departmentName, String phone) {
        this.did = did;
        this.departmentName = departmentName;
        this.phone = phone;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
