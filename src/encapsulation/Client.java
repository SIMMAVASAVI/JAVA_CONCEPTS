package encapsulation;

/*

Encapsulation wraps data of a real word entity together using properties/attributes and behaviour/action.
Using access modifiers it protects data from outside world, which exposes only user accessible interface ---> Data Hiding

public -> access anywhere
protected -> access inside package in  all classes and outside child packages as well.
default -> access inside package in  all classes, no where outside the class
private -> access inside class
 */

public class Client {

    public static void main(String[] args) {

        Point bottomleft=new Point(3,2);

        Rectangle rect= new Rectangle(bottomleft,4,6);

        System.out.println(rect.area());
        System.out.println(rect.perimeter());

        System.out.println(rect.topRightCoordinate().toString());

    }
}



