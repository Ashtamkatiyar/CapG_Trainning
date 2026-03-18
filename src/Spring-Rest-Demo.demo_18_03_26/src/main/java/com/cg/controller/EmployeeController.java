package com.cg.controller;

import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private IEmployeeService service;

    public EmployeeController(IEmployeeService service) {
        this.service = service;
    }

    // GET all employees
    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployee();
    }

    // GET employee by ID
    @GetMapping("/{empId}")
    public Employee getEmployee(@PathVariable int empId){
        return service.getEmployee(empId);
    }

    // GET employee by name
    @GetMapping("/name/{name}")
    public List<Employee> getEmpByName(@PathVariable String name){
        return service.getByName(name);
    }

    // CREATE employee
    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee emp){
        return service.createEmployee(emp);
    }

    // DELETE employee
    @DeleteMapping("/{empId}")
    public String removeEmployee(@PathVariable int empId){
        return service.removeEmployee(empId);
    }

    // UPDATE employee
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee e){
        return service.updateEmployee(e);
    }
}

