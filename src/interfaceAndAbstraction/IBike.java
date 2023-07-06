package interfaceAndAbstraction;

public interface IBike {

    public void run();

    static void horn() {
        System.out.println("Static method in interface");
    }
}
