package Day3Stream.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> li=new ArrayList<>();
        li.add(new Employee(101,"Atul",56000));
        li.add(new Employee(102,"Saurabh",54000));
        li.add(new Employee(103,"Ashtam",66000));
        li.add(new Employee(104,"Deep",86000));
        li.add(new Employee(105,"Saksham",574800));
      //  li.stream().filter(e->e.getSalary()>50000).forEach(num-> System.out.println(num));
//     Employee d=li.stream().max((e1, e2)->e1.getSalary()-e2.getSalary()).get();
//        System.out.println(d);
//       double totalsal= li.stream().collect(Collectors.summingDouble(e->e.getSalary()));
//        System.out.println(totalsal);

        long starttime1=System.currentTimeMillis();
        double avg= li.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
        System.out.println(avg);
        long endtime1=System.currentTimeMillis();
        System.out.println("Time taken by serial Stream "+ (endtime1-starttime1));

        long starttime2=System.currentTimeMillis();
        double avg2= li.parallelStream().collect(Collectors.averagingDouble(e->e.getSalary()));
        System.out.println(avg2);
        long endtime2=System.currentTimeMillis();
        System.out.println("Time taken by Parallel Stream "+ (endtime2-starttime2));

    }
}
