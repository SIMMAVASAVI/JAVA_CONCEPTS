package multiThreading.atomicDataType;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCount {
    AtomicInteger atomicInteger;


    public AtomicCount(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }
}
