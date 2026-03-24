package org.cg;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator c=(i,j)->i+j;
        CalculatorService cservice=new CalculatorService(c);
        System.out.println(cservice.addService(4,5));
    }
}
