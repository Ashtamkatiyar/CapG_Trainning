package Day4Assignment_StreamApi_28_02_2026;


public class TestApp {

    public static void main(String[] args) {

        System.out.println("Average Salary: " +
                EmployeeService.calculateAverageSalary());

        System.out.println("\nMax Salary By Department:");
       System.out.println(EmployeeService.getMaxSalaryByDepartment());

        System.out.println("\nTotal Salary By Department:");
        System.out.println(EmployeeService.getTotalSalaryByDepartment());

        System.out.println("\nEmployee Name & Salary:");
         EmployeeService.displayNameAndSalary();

       System.out.println("\nSorted By Salary Desc:");
        System.out.print( EmployeeService.sortSalDesc());

    }
}
