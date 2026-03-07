package com.cg;

import java.util.List;

public class EmployeeService implements IEmployeeService {

    private EmployeeDao dao = new EmployeeDao();

    @Override
    public String addEmployee(Employee emp) {
        if (emp.getName() == null || emp.getName().isEmpty()) {
            return "Name cannot be empty";
        }
        return dao.saveEmployee(emp);
    }

    @Override
    public Employee getEmployee(String empid) {
        return dao.findEmployee(empid);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.getAll();
    }

    @Override
    public String updateEmployee(Employee emp) {
        return dao.updateEmployee(emp);
    }

    @Override
    public String deleteEmployee(String empid) {
        return dao.deleteEmployee(empid);
    }
}