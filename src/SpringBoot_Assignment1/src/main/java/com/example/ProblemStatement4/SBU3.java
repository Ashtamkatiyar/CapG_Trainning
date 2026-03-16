package com.example.ProblemStatement4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SBU3 {

    @Value("${sbuId}")
    private int sbuId;

    @Value("${sbuName}")
    private String sbuName;

    @Value("${sbuHead}")
    private String sbuHead;

    private List<Employee4> empList;

    public List<Employee4> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee4> empList) {
        this.empList = empList;
    }

    public void getemp4details(int id){

        boolean flag=false;

        for(Employee4 emp:empList){

            if(emp.getEmployeeId()==id){
                emp.getDetails();
                flag=true;
                return;
            }
        }

        if(!flag){
            System.out.println("Not Found!");
        }
    }
}