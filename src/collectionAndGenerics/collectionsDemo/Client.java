package collectionAndGenerics.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        ListDemo listDemo=new ListDemo(list);
        listDemo.listActions();
    }

}
