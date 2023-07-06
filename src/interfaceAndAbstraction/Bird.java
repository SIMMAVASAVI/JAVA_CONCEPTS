package interfaceAndAbstraction;

public abstract class Bird {

    public int noOfLegs;
    public int noOfWings;

    public abstract void eat();
    public void sleep(){
        System.out.println("Bird is Sleeping");
    }
    public void breathe(){
        System.out.println( " Bird is Sleeping");
    }

}
