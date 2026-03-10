package FileHandling.Object_WriteandRead;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectRead {
    public static void main(String[] args) {

        try (ObjectInputStream inp=new ObjectInputStream(new FileInputStream("data/studentObj.txt"))){
            while (true) {
                try{
                student s=(student) inp.readObject();
                System.out.println(s);
            }

         catch (EOFException e) {
             break;
         }
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
