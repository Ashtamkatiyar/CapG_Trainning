package com.example.ProblemStatement1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${employeeId}")
    private int employeeId;
    @Value("${employeeName}")
    private String employeeName;
    @Value("${salary}")
    private double salary;
    @Value("${businessUnit}")
    private String businessUnit;
    @Value("${age}")
    private int age;

    public void getDetails(){
        System.out.println("EmployeeID :"+ employeeId);
        System.out.println("EmployeeName :"+employeeName);
        System.out.println("EmployeeSalary :"+salary);
        System.out.println("BusinessUnit :"+businessUnit);
        System.out.println("Age :"+age);

    }
}
