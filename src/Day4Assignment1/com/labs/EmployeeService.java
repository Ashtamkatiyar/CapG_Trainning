package Day4Assignment1.com.labs;



import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    // 1. Average Salary
    public static double calculateAverageSalary() {
        return EmployeeRepository.getEmployees()
                .stream().map(e->e.getSalary()).collect(Collectors.averagingDouble(n->n));
    }

    // 2. Max salary employee in each department
    public static Map<String, Optional<Employee>> getMaxSalaryByDepartment() {
        return EmployeeRepository.getEmployees()
                .stream()
                .filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().getDepartmentName(),
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
    }

    // 3. Total salary per department
    public static Map<String, Double> getTotalSalaryByDepartment() {
        return EmployeeRepository.getEmployees()
                .stream()
                .filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().getDepartmentName(),
                        Collectors.summingDouble(Employee::getSalary)
                ));
    }

    // 4. Display employee name and salary
    public static void displayNameAndSalary() {
        EmployeeRepository.getEmployees().forEach(employee -> {
            System.out.println(employee.getFirstName()+" "+ employee.getSalary());
        });
    }

    // 5. Sort by salary descending
   public static List<Employee> sortSalDesc(){
        return EmployeeRepository.getEmployees()
                .stream().sorted((e1,e2)-> Double.compare(e2.getSalary(),e1.getSalary())).collect(Collectors.toList());
    }
}