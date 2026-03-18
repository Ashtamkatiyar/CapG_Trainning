package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService implements IEmployeeService{

   //@Autowired
   private IEmployeeRepo erepo;

    public EmployeeService(IEmployeeRepo erepo) {
        this.erepo = erepo;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return erepo.findAll();
    }

    @Override
    public Employee createEmployee(Employee e) {
        return erepo.saveAndFlush(e);
    }

    @Override
    public Employee getEmployee(int empId) {
        Employee e = erepo.findById(empId).orElse(null);
        if(e != null){
            return e;
        }
        else return null;
    }

    @Override
    public String removeEmployee(int empId) {
        Employee e=erepo.findById(empId).orElse(null);
        if(e!=null){
            erepo.delete(e);
            return " Employee Deleted";
        }
        else return "Not Exists";

    }

    @Override
    public Employee updateEmployee(Employee e) {
        Employee existing = erepo.findById(e.getEmpid()).orElse(null);

        if(existing != null){
            System.out.println("Employee Updated ");
            return erepo.saveAndFlush(e);

        }
        else{
            return null;
        }
    }

    public List<Employee> getByName(String name){
        return erepo.findByName(name);
    }
}
