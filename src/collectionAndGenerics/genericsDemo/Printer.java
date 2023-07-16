package collectionAndGenerics.genericsDemo;

public class Printer<T>{
    T toPrint;

    public Printer(T toPrint) {
        this.toPrint = toPrint;
    }

    public void print(){
        System.out.println("Printing value: "+ toPrint);
    }
}
