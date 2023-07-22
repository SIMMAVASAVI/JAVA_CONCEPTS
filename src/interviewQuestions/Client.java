package interviewQuestions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;

public class Client implements Serializable {

    public static void main(String[] args) {

        // Anonymous class - we can create an object of type of Interface, without creating an implementation class.
        Thread t= new Thread(new Runnable() {
            @Override
            public void run() {System.out.println("Implementation logic inside run method");}
        });
        System.out.println(t.getName());
        t.start();

        Bird bird=new Bird() {
            @Override
            public void eat() {
                System.out.println("Bird is eating");
            }

            @Override
            public void fly() {
                System.out.println("Bird is flying");
            }
        };
        bird.eat();
        bird.fly();
        demo();
    }

    public static void demo(){

        Employee e1=new Employee() {
            @Override
            public void work() {
                System.out.println("Employee is working");
            }
        };

        e1.work();

        // lambda functions - anonymous class is modified to make it simple forming lambda function
        //and lambda function is applicable only for functional interface - we cant write lambda function if interface is not functional
        Employee e2= (()-> System.out.println("Employee is working"));

//        Employee e2 = (() -> {
//            System.out.println("Employee is working");
//            System.out.println("Employee is resting");
//            }
//        );

        //lambda for method with one param
        Printer<String> p=((s) -> System.out.println("Welcome to my world " + s));
        p.print("vasavi");

        //lambda for method with two param
        Adder add= (a,b) -> System.out.println(a+b);
        add.adder(10,20);

        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Bannana");
        fruits.add("Grape");
        fruits.add("Apple");
        fruits.add("Illachi");
        fruits.add("Mango");

        Collections.sort(fruits,(String a,String b) -> a.compareTo(b));
        System.out.println(fruits);
    }
}
