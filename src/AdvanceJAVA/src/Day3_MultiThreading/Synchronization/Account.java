package Day3_MultiThreading.Synchronization;

public class Account  implements Runnable{

    private double accBalance=20000;
    public synchronized void withraw(String name,double amount){
        if(amount<accBalance){
            System.out.println(name+" is going to withdraw ");
            accBalance-=amount;
            System.out.println("Has available balance "+accBalance);
        }
        else {
            System.out.println(name+" has not enough balance ");
        }

    }
    @Override
    public void run(){
        withraw(Thread.currentThread().getName(), 10000);
    }

}
