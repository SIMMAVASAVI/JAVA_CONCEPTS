package multiThreading;

public class ClientJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter hlw=new HelloWorldPrinter();
        Thread t1=new Thread(hlw);
        t1.start();
        t1.join();
        System.out.println("Main thread executed");

    }
}
