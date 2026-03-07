package com.cg.OneToManyOwn;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptid;

    private String deptname;

    @OneToMany( mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> emp;

    public Department() {}

    public Department(String deptname) {
        this.deptname = deptname;
    }

    public int getDeptid() {
        return deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", emp=" + emp +
                '}';
    }
}