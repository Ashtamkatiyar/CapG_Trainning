package com.example.ProblemStatement3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SBU2 {

    @Value("${sbuId}")
    private int sbuId;
    @Value("${sbuName}")
    private String sbuName;
    @Value("${sbuHead}")
    private String sbuHead;
    private List<Employee3> empList;

    public int getSbuId() {
        return sbuId;
    }

    public void setSbuId(int sbuId) {
        this.sbuId = sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public List<Employee3> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee3> empList) {
        this.empList = empList;
    }

    public SBU2(List<Employee3> empList) {
        this.empList = empList;
    }

    public SBU2() {
    }

    public void getsbu2details(){
        System.out.println("---------SBU Details-------");
        System.out.println("SBU_ID "+sbuId);
        System.out.println("SBU_Name "+sbuName);
        System.out.println("SBU_Head "+sbuHead);

        System.out.println("Employess Detail...........");
        int count =1;
        for(Employee3 e3:empList){
            System.out.println("Employee : "+count++);
            e3.getDetails();
        }
    }
}
