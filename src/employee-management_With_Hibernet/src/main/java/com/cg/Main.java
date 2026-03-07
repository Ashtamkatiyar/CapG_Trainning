package com.cg;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        System.out.println("===== EMPLOYEE MANAGEMENT =====");
        System.out.println("1. Add Employee");
        System.out.println("2. Get Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Get All Employees");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {

            case 1:
                System.out.print("Enter ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter DOB: ");
                String dob = sc.nextLine();

                Employee emp = new Employee(id, name, email, dob);
                System.out.println(service.addEmployee(emp));
                break;

            case 2:
                System.out.print("Enter ID: ");
                String searchId = sc.nextLine();
                System.out.println(service.getEmployee(searchId));
                break;

            case 3:
                System.out.print("Enter ID: ");
                String updateId = sc.nextLine();

                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();

                System.out.print("Enter New Email: ");
                String newEmail = sc.nextLine();

                System.out.print("Enter New DOB: ");
                String newDob = sc.nextLine();

                Employee updateEmp = new Employee(updateId, newName, newEmail, newDob);
                System.out.println(service.updateEmployee(updateEmp));
                break;

            case 4:
                System.out.print("Enter ID: ");
                String deleteId = sc.nextLine();
                System.out.println(service.deleteEmployee(deleteId));
                break;

            case 5:
                List<Employee> list = service.getAllEmployees();
                list.forEach(System.out::println);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}