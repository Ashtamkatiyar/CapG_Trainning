package com.example.ProblemStatement3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee3 {

    private int employeeId;

    private String employeeName;

    private double salary;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee3() {
    }

    public void getDetails(){
        System.out.println("EmployeeID :"+ employeeId);
        System.out.println("EmployeeName :"+employeeName);
        System.out.println("EmployeeSalary :"+salary);

    }

    public Employee3(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
}
