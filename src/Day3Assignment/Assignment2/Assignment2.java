package Day3Assignment.Assignment2;

public class Assignment2 implements Runnable{

    public void run(){

       while (true){
           int timer=0;
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
           try {
               Thread.sleep(10000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("Timer Refreshed ");

       }
    }

    public static void main(String[] args) {
        Assignment2 as = new Assignment2();
        Thread t1=new Thread(as,"Ashtam");
        t1.start();
    }
}
