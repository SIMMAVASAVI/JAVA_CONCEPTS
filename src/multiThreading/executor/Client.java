package multiThreading.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Take object of a class
        //Create a thread using object created
        //start the Thread

        //** now we will do this using Executor//
//        ExecutorService executor= Executors.newScheduledThreadPool(10); // executor service with a thread pool
//        for(int i=1;i<=50;i++){
//            if(i==5|| i==15 || i==20){
//                System.out.println("Debug");
//            }
//            CubePrinter cb=new CubePrinter(i);
//            executor.execute(cb);
//
//        }
//
//        executor.shutdown();

        ExecutorService executorService=Executors.newCachedThreadPool();
        List<Integer> list=List.of(3,8,3,19,3,9,13,12,1,0);
        MergeSorter mergeSorter= new MergeSorter(list,executorService);
        Future<List<Integer>> mergedArr= executorService.submit(mergeSorter);
        System.out.println(mergedArr.get());
        executorService.shutdown();

    }
}
