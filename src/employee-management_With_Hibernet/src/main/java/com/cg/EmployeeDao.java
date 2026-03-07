package com.cg;

import jakarta.persistence.*;

import java.util.List;

public class EmployeeDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
    EntityManager em= emf.createEntityManager();

    // for Saving

    public String saveEmployee(Employee emp) {
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        return "Employee Saved";
    }

    // for finding data
    public Employee findEmployee(String empid) {
        return em.find(Employee.class, empid);
    }

    // for  Getting all
    public List<Employee> getAll() {
        return em.createQuery("from Employee")
                .getResultList();
    }

    // for Updating
    public String updateEmployee(Employee emp) {
        em.getTransaction().begin();
        Employee e = em.find(Employee.class, emp.getEmpid());
        if (e != null) {
            e.setName(emp.getName());
            e.setDob(emp.getDob());
            e.setEmail(emp.getEmail());
        }
      em.getTransaction().commit();
        return "Employee Updated";
    }

    // for  Deleting
    public String deleteEmployee(String empid) {

        em.getTransaction().begin();
        Employee emp = em.find(Employee.class, empid);
        if (emp != null) {
            em.remove(emp);
        }
        em.getTransaction().commit();
        return "Employee Deleted";
    }
}