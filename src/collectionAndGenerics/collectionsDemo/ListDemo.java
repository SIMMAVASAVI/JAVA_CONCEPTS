package collectionAndGenerics.collectionsDemo;

import java.util.Iterator;
import java.util.List;

public class ListDemo {
    List<Integer> listInstance;

    public ListDemo(List<Integer> list) {
        this.listInstance = list;
    }

    public void listArrayListActions() {
        listInstance.add(11); //0
        listInstance.add(22); //1
        listInstance.add(30); //2
        listInstance.add(30); //3
        listInstance.add(30); //4
        listInstance.add(30); //5

        //Prints the size of array
        System.out.println("ArrayList size is "+ listInstance.size());

        //adds element at the end of list
        System.out.println("Added "+ listInstance.add(5)+ listInstance);

        //adds element at specific index
        listInstance.add(5, 100);
        System.out.println("Added element at specific index "+ listInstance);

        //Sets value to specific index
        int currentVal = listInstance.set(2, 40);
        System.out.println("CURRENT VAL : " + currentVal + listInstance);

        //removes element from specific Index
        System.out.println("Remove index "+ listInstance.remove(4) + listInstance);

        //removes the first occurrence of object(value) from list
        Integer x=30;
        System.out.println("Remove value "+ listInstance.remove(x) + listInstance);

        //Checks if the list contains an element
        System.out.println("Contains "+ listInstance.contains(5));

        //Print with a normal For loop
        System.out.println("Print with a normal For loop");
        for(int i = 0; i< listInstance.size(); i++){
            System.out.println(listInstance.get(i));
        }

        //Print with enhanced for loop
        System.out.println("print with enhanced for loop");
        for(Integer i : listInstance){
            System.out.println(i);
        }

        //Print with iterator
        System.out.println("Print with iterator");
        Iterator<Integer> integerIterator = listInstance.listIterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        //we are able to directly print the list because it has toString() implementation
        System.out.println("To String : " + listInstance.toString());

    }


}
