package multiThreading;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter helloWorldPrinter=new HelloWorldPrinter();
        Thread t1= new Thread(helloWorldPrinter);
        t1.start();
        // Thread.sleep(8000); // asking the main thread to pause execution for 3 secs
        System.out.println("thread name in Main - " + Thread.currentThread().getName());
        System.out.println("Hello World from Main");

        //for passing param to run method , weh ave to use attributes in teh class and set the attributes accordingly
        Adder add= new Adder(2,7);
        Thread t2=new Thread(add);
        t2.start();

        //for creating multiple threads and do square of n numbers using n threads
        for(int i=1; i<=50; i++){
            Square sq=new Square(i);
            Thread sqThread= new Thread(sq);
            sqThread.start();
        }



    }

}
