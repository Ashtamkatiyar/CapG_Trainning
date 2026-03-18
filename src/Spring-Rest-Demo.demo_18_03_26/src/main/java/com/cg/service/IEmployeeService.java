package com.cg.service;

import com.cg.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getAllEmployee();

    public Employee createEmployee(Employee e);

    public Employee getEmployee(int empId);

    public String removeEmployee(int empId);

    public Employee updateEmployee(Employee e);


    List<Employee> getByName(String name);
}
