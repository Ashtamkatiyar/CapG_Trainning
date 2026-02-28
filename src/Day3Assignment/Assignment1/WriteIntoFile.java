package Day3Assignment.Assignment1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writter=new FileWriter("source.txt");
        writter.write("Hello Ashtam\n");
        writter.write("Welcome to File Handling");
        writter.close();
        System.out.println("Data Written Successfully");
    }
}
