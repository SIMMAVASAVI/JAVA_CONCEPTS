package encapsulation;

public class Rectangle {
    public Rectangle(Point point, int length, int breadth) {
        this.point = point;
        this.length = length;
        this.breadth = breadth;
    }

    Point point;
    int length;
    int breadth;

    public double area(){

        return (this.length*this.breadth);

    }

    public double perimeter(){

        return (2*(this.length+this.breadth));

    }

    public Point topRightCoordinate() {

        Point topRightpoint= new Point(this.point.getX()+length,this.point.getY()+breadth);

        return topRightpoint;
    }

}
