package Day3Assignment.Assignment1;

import java.io.File;
import java.io.IOException;

public class CreateSourceFile {
    public static void main(String[] args) throws IOException {
        File file=new File("source.txt");
        if(file.createNewFile()){
            System.out.println("File created SuccessFully : ");
        }
        else System.out.println("file Already Exists ");
    }
}
