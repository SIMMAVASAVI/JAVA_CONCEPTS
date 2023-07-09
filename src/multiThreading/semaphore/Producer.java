package multiThreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    public Queue<Shirt> store;
    public int maxSizeOfStore;

    private String name;

    private Semaphore semaphoreProducer;
    private Semaphore semaphoreConsumer;

    public Producer(Queue<Shirt> store, int maxSizeOfStore, String name, Semaphore semaphoreProducer, Semaphore semaphoreConsumer) {
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
                semaphoreProducer.acquire();
                store.add(new Shirt());
                System.out.println(name+ ": produced Total Shirts available: "+ store.size());
                semaphoreConsumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
