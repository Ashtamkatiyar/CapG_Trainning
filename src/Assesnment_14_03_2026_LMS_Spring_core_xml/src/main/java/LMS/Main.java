package LMS;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");

        Librarian lib=(Librarian) ctx.getBean("lib");
        lib.issueBook();
    }
}
