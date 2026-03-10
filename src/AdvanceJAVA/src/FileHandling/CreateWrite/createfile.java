package FileHandling.CreateWrite;

import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {

        try {
            File file = new File("data/student.txt");

            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}