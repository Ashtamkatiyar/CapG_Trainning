package com.cg;

import java.util.List;

public interface IEmployeeService {

    String addEmployee(Employee emp);

    Employee getEmployee(String empid);

    List<Employee> getAllEmployees();

    String updateEmployee(Employee emp);

    String deleteEmployee(String empid);
}