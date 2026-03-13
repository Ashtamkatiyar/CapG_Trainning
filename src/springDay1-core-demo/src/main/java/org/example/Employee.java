package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private int empid;
    private String name;

    @Autowired
    @Qualifier("add")
    private Address address;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printEmployee(){
        System.out.println("EmpID : "+empid);
        System.out.println("EmpName : "+name);
        System.out.println("-------EmpAddress----");
        System.out.println("City :"+ address.getCity());
        System.out.println("County :"+address.getCountry());
        System.out.println("County :"+address.getZip());
    }

    public Employee(int empid, String name, Address address) {
        this.empid = empid;
        this.name = name;
        this.address = address;
    }

    public Employee() {
    }
}
