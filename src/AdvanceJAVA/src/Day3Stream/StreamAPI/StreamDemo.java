package Day3Stream.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        Stream<Integer> s=Stream.of(23,45,12,78);
//        Predicate<Integer> p=i-> i<30;
//        s.filter(p).map(i->i*i).forEach(System.out::println);

        List<String> lst = new ArrayList<>();
        lst.add("Amit");
        lst.add("Saurabh");
        lst.add("Abhigyan");
        lst.add("Deep");
        lst.add("Deependra");
        lst.add("Aman");
        lst.add("Amit");
        lst.add("Deep");
        lst.add("Deependra");

//        List<String>li=lst.stream().sorted((a, b) -> b.compareTo(a)).filter(name -> name.startsWith("A")).map(s -> s.concat("  Kumar")).collect(Collectors.toList());
//        System.out.println(li);

        Map<String,Long> result=lst.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(result);

    }
}
