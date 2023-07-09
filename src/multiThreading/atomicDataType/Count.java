package multiThreading.atomicDataType;

public class Count {

    private int count;


    public Count(int count) {
        this.count = count;
    }

    public int increamentAndGet(){
        this.count++;
        return count;
    }
}
