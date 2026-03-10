package FileHandling.Object_WriteandRead;

import java.io.Serializable;

public class student implements Serializable {

     @Override
             public String toString(){
         return "Student Id :" +id +"Student Name :"+ name;
     }
        int id;
        String name;
        public student(int id,String name){
            this.id=id;
            this.name=name;
        }

}
