package multiThreading;

import java.util.SortedMap;

public class HelloWorldPrinter implements Runnable{


    @Override
    public void run() {
        System.out.println("Current Thread - " + Thread.currentThread().getName());
        System.out.println("Hello world in HelloWorldPrinter Class");
    }
}
