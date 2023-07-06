package interfaceAndAbstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //list of parent references , calling child functionality with parent references
        List<Bird> birds= new ArrayList<>();
        birds.add(new Pegion());
        birds.add(new Sparrow());
        for(Bird b: birds){
            b.breathe();
        }

        List<IFlyable> iFlyables=new ArrayList<>();
        iFlyables.add(new Sparrow());
        iFlyables.add(new Sparrow());
        for(IFlyable iFlyable: iFlyables){
            iFlyable.fly();
        }

        List<Car> cars=new ArrayList<>();
        cars.add(new Car(100,500000));
        cars.add(new Car(105,600000));
        cars.add(new Car(90,400000));
        System.out.println(cars + " - Unsorted Cars");
        Collections.sort(cars);
        System.out.println(cars + "- Sorted Cars");

        PersonalVehicle pv= new PersonalVehicle();
        //upcasting - parent reference holding teh child object
        IBike pvBike= new PersonalVehicle();
        ICar pvCar=new PersonalVehicle();
        // below all 3 calls will call child class methods
        pv.run();
        pvBike.run();
        pvCar.run();

        pv.horn();
        //we cannot override static methods , it will call parent functionality instead of child in upcasting
        IBike.horn();
        //we are not able to call the method in child which is not there in parent, with parent reference
        //pvCar.sound();
        pv.sound();

    }
}
