package org.example;


import java.util.List;

public class SBU {

    private int sbuId;
    private String sbuName;
    private String sbuHead;

    private List<Employee> empList;

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

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void display() {

        System.out.println("SBU Details");
        System.out.println("----------------------------");
        System.out.println("SBU ID : " + sbuId);
        System.out.println("SBU Name : " + sbuName);
        System.out.println("SBU Head : " + sbuHead);

        System.out.println("\nEmployee List");

        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}
