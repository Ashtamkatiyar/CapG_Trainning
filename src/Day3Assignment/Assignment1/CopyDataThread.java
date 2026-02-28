package Day3Assignment.Assignment1;

import java.io.*;
import java.time.LocalTime;

public class CopyDataThread implements Runnable{
    public void run(){
        try {
            FileReader fr=new FileReader("source.txt");
            FileWriter fw=new FileWriter("destination.txt");
            int count=0;
            int ch;
            while (((ch=fr.read()) !=-1)  ){
                fw.write(ch);
                count++;
                if(count==10){
                    System.out.println("10 char are copied "+ LocalTime.now());
                    count=0;
                    Thread.sleep(5000);
                }
            }
            fr.close();
            fw.close();
            System.out.println("File copied successfully : ");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CopyDataThread cp=new CopyDataThread();
        Thread t1=new Thread(cp,"t1");
        t1.start();
    }

}
