package multiThreading.callableAndFuture;

import java.util.List;
import java.util.concurrent.Callable;

public class ArrayAdder implements Callable<Integer> {

    List<Integer> elements;

    public ArrayAdder(List<Integer> elements) {
        this.elements = elements;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i: this.elements){
            sum+=i;
        }
        return sum;
    }
}
