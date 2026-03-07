package com.cg.OneToManyOwn;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf1.createEntityManager();

        Department dept = new Department("Sales");

        Employee e1 = new Employee("Ashtam", 5000);
        Employee e2 = new Employee("Deep", 3000);

        e1.setDepartment(dept);
        e2.setDepartment(dept);

        List<Employee> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e2);

        dept.setEmp(emp);

        em.getTransaction().begin();

        em.persist(dept);   // cascade will save employees

        em.getTransaction().commit();

        System.out.println("Employees Added Successfully");
    }
}