package multiThreading;

public class Square implements Runnable{
    public int n;

    public Square(int n) {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(" Thread name in Square -" + Thread.currentThread().getName());
        System.out.println(this.n*this.n);
    }
}
