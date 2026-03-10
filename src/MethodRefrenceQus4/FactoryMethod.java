package MethodRefrenceQus4;

public class FactoryMethod {
    public Student createObject(){
        Student s=new Student();
        s.setName("Ashtam");
        s.setMarks(20);
        return s;
    }

}
