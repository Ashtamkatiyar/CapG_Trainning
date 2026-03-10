package Day3_MultiThreading;

//either extend Thread  or by implementing runable

public class MyThread extends Thread {

    public void run(){
        System.out.println(MyThread.currentThread().getName()+" is running ");
    }
    public static void main(String[] args) {
       // System.out.println(Thread.currentThread().getName()); // main


        MyThread t1=new MyThread();
        t1.start();

    }
}
