package Day3StreamAssignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class EmployeeService {
    static EmployeeRepository e=new EmployeeRepository();

    // Qus1

    public static double Totalsal(){
        double totalsal=e.getEmployees().stream().collect(Collectors.summingDouble(e->e.getSalary()));
        return totalsal;
    }

//    public static void totalemp(){
//        double totalemp=e.getEmployees().stream().collect(Collectors.groupingBy(n->n.getDepartment()))
//    }

    //Qus3

    public static Employee senEmp(){
        Employee emp=e.getEmployees().stream().min((e1, e2)-> e1.getHireDate().compareTo(e2.getHireDate())).get();
        return emp;
    }

    //Qus 4
    public static void DueOfService( ){
        LocalDate today=LocalDate.now();
        e.getEmployees().stream().forEach(e ->{
            Period period=Period.between(e.getHireDate(),today);
            int years= period.getYears();
            int monts= period.getMonths();
            int days= period.getDays();
            System.out.println(e.getFirstName()+ " Years : "+years +" Months "+monts+" Days "+ days);
        } );
    }

    // Qus5

    public static List<Employee> EmpWithOutdept() {
        return e.getEmployees()
                .stream()
                .filter(i -> i.getDepartment() == null)
                .collect(Collectors.toList());

     }

     // Qus6

//    public static List<Employee> deptWithoutEmp(
//            ) {
//
//        return EmployeeRepository.getDepartments().stream().filter(d -> e.getEmployees().stream().noneMatch(e ->
//                                e.getDepartment() != null && e.getDepartment().getDepartmentId() == d.getDepartmentId());
//    }
//



}
