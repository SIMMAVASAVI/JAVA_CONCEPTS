package collectionAndGenerics.collectionsDemo;

import java.util.*;

//List, actions, types and internal working
//Set, actions, types and internal working
//HashMap internal working

public class Client {

    public static void main(String[] args) {

        //--------------------------ListInterfaceImplementations----------------------

        List<Integer> list=new ArrayList<>();
        ListDemo listDemo=new ListDemo(list);
        listDemo.listArrayListActions();

        //----------------------------SetInterfaceImplementations ----------------------

        Set<Integer> hashSet=new HashSet<>();
        SetDemo setDemo=new SetDemo(hashSet);
        setDemo.listHashSetActions();

        Set<Integer> linkedhashSet=new LinkedHashSet<>();
        SetDemo linkedsetDemo=new SetDemo(linkedhashSet);
        linkedsetDemo.listLinkedHashSetActions();

        Set<Integer> treeSet=new TreeSet<>();
        SetDemo treeSetDemo=new SetDemo(treeSet);
        treeSetDemo.listTreeSetActions();

        //------------------------------------ Queue ---------------------------------

        Queue<Integer> arrayDeQueue= new ArrayDeque<>();
        QueueDemo queueDemo= new QueueDemo(arrayDeQueue);
        queueDemo.listArrayDequeActions();

        //----------------------------------- HashMap ---------------------------------

        HashMap<String, Integer> hashMap= new HashMap<>();
        HashMapDemo hashMapDemo= new HashMapDemo(hashMap);
        hashMap.put("Deepan",1);
        hashMap.put("Priyanka",2);
        hashMap.put("Priyanka",1); // when we insert the same key with a value, current value gets overridden
        System.out.println(hashMap);


    }

}