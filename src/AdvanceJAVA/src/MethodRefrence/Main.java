package MethodRefrence;

public class Main {
    public static void main(String[] args) {
        Icalculate cal=new Sum()::add;
        System.out.println(cal.calculate(3,6));
    }
}
