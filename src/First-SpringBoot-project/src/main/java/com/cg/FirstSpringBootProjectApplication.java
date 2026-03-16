package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		Employee emp=ctx.getBean(Employee.class);
		emp.printEmployee();
	}}



