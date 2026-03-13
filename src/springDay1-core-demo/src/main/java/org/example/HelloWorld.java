package org.example;

import java.util.List;

public class HelloWorld {
    private String name;

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    private List<String> course;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public HelloWorld(String name) {
//        this.name = name;
//    }
//
//    public HelloWorld() {
//    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }

    public  String sayHello(){
        return "Hello "+name.toUpperCase();
    }
}
