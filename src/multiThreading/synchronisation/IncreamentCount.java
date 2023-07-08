package multiThreading.synchronisation;

public class IncreamentCount implements Runnable {

    private Count count;

    public IncreamentCount(Count count){

        this.count=count;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            count.increament();
        }
    }
}
