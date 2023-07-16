package collectionAndGenerics.genericsDemo;

//Generics is used when we want to create Variable Data type as below
// we just have to use <> before class to pass the variable data type to class , and can use the same where ever we want

public class Client {
    public static void main(String[] args) {

        //Generics only works with objects and does not work with primitives
//        Printer<int> integerPrinter1 = new Printer<>(5);
//        integerPrinter.print();

        // Integer Print
        Printer<Integer> integerPrinter=new Printer<>(20);
        integerPrinter.print();

        //String Print
        Printer<String> stringPrinter=new Printer<>("vasavi");
        stringPrinter.print();

        //Double Print
        Printer<Double> floatPrinter=new Printer<>(10.0);
        floatPrinter.print();

        //Student Print
        Printer<Student> studentPrinter=new Printer<>(new Student("Vasavi",1773402));
        studentPrinter.print();
    }
}
