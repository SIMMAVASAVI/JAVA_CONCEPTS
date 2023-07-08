package multiThreading.synchronisation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
    int value=0;

    private final Lock lock; //Mutually exclusive lock or Mutex lock

    public Count (){
        lock=new ReentrantLock();
    }

    public void increament(){
        lock.lock();
        value++;
        lock.unlock();
    }

//    //synchronized Block
//    public void increament(){
//        synchronized (this) {
//            value++;
//        }
//    }

// below is the synchronized Method
//    public synchronized void increament(){
//            value++;
//    }

    public int getValue(){
        return this.value;
    }
}
