package Day3Assignment.Assignment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram {

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");

            CopyDataThread2 thread = new CopyDataThread2(fis, fos);

            thread.start();   // Thread start

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
