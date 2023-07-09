package multiThreading.semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        Queue<Shirt> store = new LinkedList<>();
        int maxSizeOfStore=5;
        Semaphore semaphoreProducer = new Semaphore(maxSizeOfStore);
        Semaphore semaphoreConsumer = new Semaphore(0);

        Producer p1=new Producer(store,maxSizeOfStore,"p1", semaphoreProducer, semaphoreConsumer);
        Producer p2=new Producer(store,maxSizeOfStore,"p2", semaphoreProducer, semaphoreConsumer);
        Producer p3=new Producer(store,maxSizeOfStore,"p3", semaphoreProducer, semaphoreConsumer);
        Producer p4=new Producer(store,maxSizeOfStore,"p4", semaphoreProducer, semaphoreConsumer);
        Producer p5=new Producer(store,maxSizeOfStore,"p4", semaphoreProducer, semaphoreConsumer);

        Consumer c1=new Consumer(store,maxSizeOfStore,"c1", semaphoreProducer, semaphoreConsumer);
        Consumer c2=new Consumer(store,maxSizeOfStore,"c2", semaphoreProducer, semaphoreConsumer);
        Consumer c3=new Consumer(store,maxSizeOfStore,"c3", semaphoreProducer, semaphoreConsumer);
        Consumer c4=new Consumer(store,maxSizeOfStore,"c4", semaphoreProducer, semaphoreConsumer);
        Consumer c5=new Consumer(store,maxSizeOfStore,"c4", semaphoreProducer, semaphoreConsumer);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        new Thread(p5).start();

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();
        new Thread(c5).start();

    }
}
