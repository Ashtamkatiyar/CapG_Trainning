package FileHandling.CreateWrite;

import java.io.File;

public class filedemo {
    public static void main(String[] args) {
        File folder=new File("data");

        // create new file

       if (!folder.exists()){
           boolean created=folder.mkdir();


       if(created) {
           System.out.println("folder created");

        }
       else {
           System.out.println("folder not created");
       } }
      else
          System.out.println("Already created");
         }

    }

