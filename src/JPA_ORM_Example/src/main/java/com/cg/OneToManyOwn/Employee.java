package com.cg.OneToManyOwn;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;

    private String name;

    private int empsal;
     @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    public Employee() {}

    public Employee(String name, int empsal) {
        this.name = name;
        this.empsal = empsal;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public int getEmpsal() {
        return empsal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpsal(int empsal) {
        this.empsal = empsal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", empsal=" + empsal +
                ", department=" + department +
                '}';
    }
}