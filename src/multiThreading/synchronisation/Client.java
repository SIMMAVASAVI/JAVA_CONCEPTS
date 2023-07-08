package multiThreading.synchronisation;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        Count count=new Count();
        IncreamentCount increamentCount1=new IncreamentCount(count);
        IncreamentCount increamentCount2=new IncreamentCount(count);
        Thread t1=new Thread(increamentCount1);
        Thread t2=new Thread(increamentCount2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.getValue());
    }
}
