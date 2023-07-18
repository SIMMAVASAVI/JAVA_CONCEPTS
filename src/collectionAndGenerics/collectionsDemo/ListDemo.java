package collectionAndGenerics.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    List<Integer> list;

    public ListDemo(List<Integer> list) {
        this.list = list;
    }

    public void listActions() {
        list.add(11); //0
        list.add(22); //1
        list.add(30); //2
        list.add(30); //3
        list.add(30); //4
        list.add(30); //5

        //Prints the size of array
        System.out.println("Array size is "+ list.size());

        //adds element at the end of list
        System.out.println("Added "+list.add(5)+list);

        //adds element at specific index
        list.add(5, 100);
        System.out.println("Added element at specific index "+list);

        //Sets value to specific index
        int currentVal = list.set(2, 40);
        System.out.println("CURRENT VAL : " + currentVal + list);

        //removes element from specific Index
        System.out.println("Remove index "+ list.remove(4) +list);

        //removes the first occurrence of object(value) from list
        Integer x=30;
        System.out.println("Remove value "+ list.remove(x) + list);

        //Checks if the list contains an element
        System.out.println("Contains "+list.contains(5));

        //Print with a normal For loop
        System.out.println("Print with a normal For loop");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        //Print with enhanced for loop
        System.out.println("print with enhanced for loop");
        for(Integer i : list){
            System.out.println(i);
        }

        //Print with iterator
        System.out.println("Print with iterator");
        Iterator<Integer> integerIterator = list.listIterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        //we are able to directly print the list because it has toString() implementation
        System.out.println("To String : " + list.toString());

    }
}
