package multiThreading.executor;

public class CubePrinter implements  Runnable{
    int n;

    public CubePrinter(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(" CubePrinter thread name -  " + Thread.currentThread().getName());
        System.out.println("cube of a number is : " + n*n*n);
    }
}
