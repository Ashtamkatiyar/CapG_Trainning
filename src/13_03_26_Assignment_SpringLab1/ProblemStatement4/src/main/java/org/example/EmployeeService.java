package org.example;


import java.util.Map;

public class EmployeeService {

    private Map<Integer, Employee> employeeMap;

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }
}