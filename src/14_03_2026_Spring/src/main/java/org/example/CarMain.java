package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

    public static void main(String[] args) {

        // Spring container load karega bean.xml file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        // Spring container se Car bean le rahe hain
        Car c = (Car) context.getBean("car");
       //c.setName("Aulto");
        // Output check
       c.printCar();
    }
}