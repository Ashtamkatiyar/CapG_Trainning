package com.example.ProblemStatement2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee2 {
    @Value("${employeeId}")
    private int employeeId;
    @Value("${employeeName}")
    private String employeeName;
    @Value("${salary}")
    private double salary;

    @Autowired
    private SBU businessUnit;


    public void getDetails(){
        System.out.println("EmployeeID :"+ employeeId);
        System.out.println("EmployeeName :"+employeeName);
        System.out.println("EmployeeSalary :"+salary);

        getsbudetails();

    }
    public void getsbudetails(){
        System.out.println("---------SBU Details-------");
        System.out.println("SBU_ID "+businessUnit.getSbuId());
        System.out.println("SBU_Name "+businessUnit.getSbuName());
        System.out.println("SBU_Head "+businessUnit.getSbuHead());
    }
}
