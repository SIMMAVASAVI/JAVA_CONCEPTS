package multiThreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    public Queue<Shirt> store;
    public int maxSizeOfStore;

    private String name;
    private Semaphore semaphoreProducer;
    private Semaphore semaphoreConsumer;


    public Consumer(Queue<Shirt> store, int maxSizeOfStore, String name, Semaphore semaphoreProducer, Semaphore semaphoreConsumer) {
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.semaphoreProducer = semaphoreProducer;
        this.semaphoreConsumer = semaphoreConsumer;
    }

    @Override
    public void run() {
        while (true){
            try {
                semaphoreConsumer.acquire();
                store.remove();
                System.out.println(name + " : bought. Total Shirts available: " + store.size());
                semaphoreProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
