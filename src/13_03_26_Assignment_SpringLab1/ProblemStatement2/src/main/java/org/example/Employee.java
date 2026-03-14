package org.example;


public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private SBU businessUnit;

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

    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void getSBUDdetails() {

        System.out.println("Employee details");
        System.out.println("Employee [empId=" + employeeId +
                ", empName=" + employeeName +
                ", empSalary=" + salary + "]");
        System.out.println("SBU details=" + businessUnit);
    }
}
