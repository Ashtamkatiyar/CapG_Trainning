package com.example;

import com.example.ProblemStatement2.Employee2;
import com.example.ProblemStatement3.Employee3;
import com.example.ProblemStatement3.SBU2;
import com.example.ProblemStatement4.Employee4;
import com.example.ProblemStatement4.SBU3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class SpringBootAssignment1Application {

	public static void main(String[] args) {

	ApplicationContext ctx= SpringApplication.run(SpringBootAssignment1Application.class, args);

//	         problemStatement1

		//Employee emp=ctx.getBean(Employee.class);
		//emp.getDetails();

//		problemStatement2

//		Employee2 emp=ctx.getBean(Employee2.class);
//		emp.getsbudetails();

//		ProblemStatement3

//		Employee3 e1=new Employee3(100002,"Yogendra",60000);
//		Employee3 e2=new Employee3(10001,"Naman",50000);
//
//		SBU2 sb=ctx.getBean(SBU2.class);
//		sb.setEmpList(Arrays.asList(e1,e2));
//		sb.getsbu2details();

		//		ProblemStatement4

//		Employee4 e1=new Employee4(100002,"Yogendra",60000);
//		Employee4 e2=new Employee4(10001,"Naman",50000);

		Employee4 e4=new Employee4(100002,"Yogendra",60000);
		Employee4 e5=new Employee4(10001,"Naman",50000);

		SBU3 sb3=ctx.getBean(SBU3.class);
		sb3.setEmpList(Arrays.asList(e4,e5));
		sb3.getemp4details(100005);



	}

}
