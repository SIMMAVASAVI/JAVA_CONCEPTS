package multiThreading.atomicDataType;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) {
        AtomicInteger atomicInteger=new AtomicInteger(0);
        Count count = new Count(0);
        AtomicCount atomicCount=new AtomicCount(atomicInteger);

        IncreamenterOfCount increamenterOfCount1= new IncreamenterOfCount(count);
        IncreamenterOfCount increamenterOfCount2= new IncreamenterOfCount(count);

        IncreamenterOfAtomicCount increamenterOfAtomicCount1=new IncreamenterOfAtomicCount(atomicCount);
        IncreamenterOfAtomicCount increamenterOfAtomicCount2=new IncreamenterOfAtomicCount(atomicCount);

        new Thread(increamenterOfCount1).start();
        new Thread(increamenterOfCount2).start();

        new Thread(increamenterOfAtomicCount1).start();
        new Thread(increamenterOfAtomicCount2).start();



    }
}
