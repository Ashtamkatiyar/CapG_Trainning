package org.example;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        EmployeeService service =
                (EmployeeService) context.getBean("service");

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID : ");

        int id = sc.nextInt();

        Employee emp = service.getEmployee(id);

        if (emp != null) {

            System.out.println("Employee Info:");
            System.out.println("Employee ID : " + emp.getEmployeeId());
            System.out.println("Employee NAME : " + emp.getEmployeeName());
            System.out.println("Employee SALARY : " + emp.getSalary());

        } else {

            System.out.println("Employee not found");

        }

        sc.close();
    }
}
