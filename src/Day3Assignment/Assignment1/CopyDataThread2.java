package Day3Assignment.Assignment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread2 extends Thread {

    private FileInputStream fr;
    private FileOutputStream fw;

    public CopyDataThread2(FileInputStream fis, FileOutputStream fos) {
        this.fr = fr;
        this.fw = fw;
    }

    @Override
    public void run() {

        try {
            byte[] buffer = new byte[10];
            int bytesRead;
            int count = 0;

            while ((bytesRead = fr.read(buffer)) != -1) {

                fw.write(buffer, 0, bytesRead);
                count++;

                if (count  == 10) {
                    System.out.println("10 characters copied");
                    Thread.sleep(5000);
                    count=0;// 5 seconds pause
                }
            }

            fr.close();
            fw.close();

            System.out.println("File Copied Successfully");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}