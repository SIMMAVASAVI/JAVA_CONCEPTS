package multiThreading.callableAndFuture;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list1= List.of(1,2,3,4);
        List<Integer> list2=List.of(1,2,3,4);

        ArrayAdder ad1= new ArrayAdder(list1);
        ArrayAdder ad2= new ArrayAdder(list2);

        //Thread t1 = new Thread(add1); // Thread will not accept callable task
        ExecutorService executor = Executors.newScheduledThreadPool(10);
        Future<Integer> f1= executor.submit(ad1);
        Future<Integer> f2= executor.submit(ad2);

        System.out.println(f1.get()+f2.get());
    }
}
