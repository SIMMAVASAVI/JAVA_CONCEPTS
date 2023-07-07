package multiThreading.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if( this.arrayToSort.size()<=1){
            return this.arrayToSort;
        }
        int mid = arrayToSort.size()/2;

        List<Integer> leftar= new ArrayList<>();
        List<Integer> rightar= new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftar.add(arrayToSort.get(i));
        }

        for(int i=mid; i<arrayToSort.size();i++){
            rightar.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter=new MergeSorter(leftar,executorService);
        MergeSorter rightMergeSorter=new MergeSorter(rightar,executorService);

        Future<List<Integer>> futureLeftSortedArr= executorService.submit(leftMergeSorter);
        Future<List<Integer>> futureRightSortedArr= executorService.submit(rightMergeSorter);

        List<Integer> mergedArr= new ArrayList<>();
        List<Integer> rightSortedArr= futureRightSortedArr.get();
        List<Integer> leftSortedArr= futureLeftSortedArr.get();

        int i=0;
        int j=0;
        while(i<rightSortedArr.size() && j<leftSortedArr.size()){
            if( rightSortedArr.get(i)<=leftSortedArr.get(j)){
                mergedArr.add(rightSortedArr.get(i));
                i+=1;
            }
            else{
                mergedArr.add(leftSortedArr.get(j));
                j+=1;
            }
        }
        while(i<rightSortedArr.size()){
            mergedArr.add(rightSortedArr.get(i));
            i+=1;
        }
        while(j<leftSortedArr.size()){
            mergedArr.add(leftSortedArr.get(j));
            j+=1;
        }
        return mergedArr;
    }
}
