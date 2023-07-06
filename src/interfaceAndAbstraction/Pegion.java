package interfaceAndAbstraction;

public class Pegion extends Bird implements IFlyable{

    @Override
    public void eat() {
        System.out.println("Pegion is eating");
    }

    @Override
    public void fly() {
        System.out.println(" Pegion is flying");
    }
}
