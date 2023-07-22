package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,4,2,6,19,23,4,32);
        List<Integer> evenList=new ArrayList<>();
        for(int i : number){
            if(i%2==0){evenList.add(i);}
        }

        //we can Use streams only with collections
        //and collections will have Intermediate and terminate methods
        // we can use intermediate first then at the end we can use terminate methods of Stream
        // First we have to create Stream object for collection then we can call teh Stream methods.

        List<Integer> evenNumbers= number.stream()
                .filter(i -> i%2==0)
                .sorted()
                .toList();
        List<Integer> oddNumbers =number.stream()
                .filter(i -> i%2!=0)
                .filter(i -> i>20).toList();

        System.out.println("Even numbers "+ evenNumbers);
        System.out.println("Odd numbers greater than 20: "+ oddNumbers);


    }
}
