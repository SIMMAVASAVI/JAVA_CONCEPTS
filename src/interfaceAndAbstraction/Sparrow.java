package interfaceAndAbstraction;

public class Sparrow extends Bird implements IFlyable{
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");

    }

    @Override
    public void fly() {
        System.out.println(" Sparrow is flying");
    }
}
