package collectionAndGenerics.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Print with a normal For loop");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("print with enhanced for loop");
        for(Integer i : list){
            System.out.println(i);
        }

        System.out.println("Print with iterator");
        Iterator<Integer> integerIterator = list.listIterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

    }
}
