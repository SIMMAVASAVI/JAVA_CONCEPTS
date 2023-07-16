package collectionAndGenerics;

//INTEGER, FLOAT, BOOLEAN, LONG ---> these are called as Wrapper Classes ( if we want Primitive Data type as Object we use wrapper classes)
//Generics and collections work using wrapper classes
public class WrapperDemo {
    public static void main(String[] args) {
        //Auto Boxing -> converting Primitive Data type to Wrapper class
        int a=20;
        Integer wrapper=a;

        //Un Boxing -> converting Wrapper to primitive Data type
        Integer wrapper1=30;
        long b=wrapper1;
    }
}
