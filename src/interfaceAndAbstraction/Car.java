package interfaceAndAbstraction;

import java.util.Comparator;

public class Car implements Comparable<Car> {

    int speed;
    int price;

    public Car(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }


    @Override
    public int compareTo(Car o) {
        return this.price-o.price;
        // if current object price is more -> +ve
        // if the input car (c) price is more -> -ve
        // if the prices are same -> 0
        // c1.compareTo(c2) : +ve -> c1 is costlier
        // c1.compareTo(c2) : -ve -> c2 is costlier
        // c1.compareTo(c2) : 0 -> both are equally priced
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                '}';
    }
}
