package com.cg.main;

import org.example.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld h1=(HelloWorld)ctx.getBean("hello");
//        HelloWorld h2=(HelloWorld)ctx.getBean("hello");
//        h1.setName("Ashtam");
//        h2.setName("katiyar");
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h1.sayHello(" Ashtam"));
       // h1.setName("Ashtam");
        System.out.println(h1.sayHello());
        System.out.println("----------------Language------------------");
        System.out.println(h1.getCourse());
        ctx.close();
    }
}
