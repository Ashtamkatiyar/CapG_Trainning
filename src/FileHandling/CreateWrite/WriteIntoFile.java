package FileHandling.CreateWrite;


import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args)  {
        try{
             dowrite();
            System.out.println("Witten into file successfully");}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void dowrite() throws IOException{
        FileWriter writter=new FileWriter("data/student.txt",true);
            writter.write("\nName : james");
               writter.write("\ncourse : Golang");
                  writter.write("\nMarks : 85");
                  writter.close();
    }
}
