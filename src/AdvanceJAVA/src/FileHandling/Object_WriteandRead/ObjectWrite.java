package FileHandling.Object_WriteandRead;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {
    public static void main(String[] args) {
        student s1=new student(5,"Ashtam");
        student s2=new student(2,"Raj");
        student s3=new student(3,"Sam");
        try (ObjectOutputStream out=new ObjectOutputStream( new FileOutputStream("data/studentObj.txt"))){
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);

            System.out.println("Object saved successfully ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
