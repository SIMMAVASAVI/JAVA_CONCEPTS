package multiThreading.atomicDataType;

import javax.swing.plaf.PanelUI;

public class IncreamenterOfAtomicCount implements Runnable{

    public AtomicCount atomicCount;

    public IncreamenterOfAtomicCount(AtomicCount atomicCount) {
        this.atomicCount = atomicCount;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("Count: " + atomicCount.atomicInteger.incrementAndGet());
        }
    }
}
