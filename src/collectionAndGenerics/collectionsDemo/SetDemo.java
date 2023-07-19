package collectionAndGenerics.collectionsDemo;

import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    Set<Integer> setInstance;

    public SetDemo(Set<Integer> hashset) {
        this.setInstance = hashset;
    }

    public void listHashSetActions() {

        // to add elements in set

        setInstance.add(4);
        setInstance.add(1);
        setInstance.add(2);
        setInstance.add(3);
        setInstance.add(null);
        setInstance.add(5);

        System.out.println("Elements added to hashset: " + setInstance);
        System.out.println("hashset size: " + setInstance.size());

        //can print set only using iterator (for loop will not work)
        System.out.println(" Print hashset using Iterator: ");
        Iterator<Integer> integerIterator= setInstance.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

    }

    public void listLinkedHashSetActions(){

        setInstance.add(1);
        setInstance.add(null);
        setInstance.add(3);
        setInstance.add(4);
        setInstance.add(4);
        setInstance.add(2);

        System.out.println("linked Hashset: "+ setInstance);

    }


    public void listTreeSetActions(){
        setInstance.add(3);
        setInstance.add(2);
        setInstance.add(9);
        //setInstance.add(null); throws error for null objects
        setInstance.add(8);
        setInstance.add(1);

        System.out.println(" TreeSet elements: "+ setInstance);

    }



}
