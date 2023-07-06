package interfaceAndAbstraction;

public class PersonalVehicle implements IBike,ICar{


    @Override
    public void run() {
        System.out.println("My Personal Vehicle is running");
    }

    static void horn() {
        System.out.println("Static method in child class personal vehicle");
    }

    void sound(){
        System.out.println(" sound method in child class");
    }
}
