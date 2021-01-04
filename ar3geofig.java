package ankit;
//Write a program to calculate the area of three geometrical figures using dynamic polymorphism
// or dynamic method dispatch
abstract class AreaPoly {

    void find_area() {
    }

}

class Circle extends AreaPoly {
    final double radius;

    void find_area() {
        System.out.println("Circle area : " + (3.14 * radius * radius));
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle extends AreaPoly {
    final double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void find_area() {
        System.out.println("Rectangle area : " + length * width);

    }

}

class Square extends AreaPoly {
    final double side;

    void find_area() {
        System.out.println("Square area : " + side * side);
    }

    public Square(double side) {
        this.side = side;
    }
}

public class ar3geofig {
    public static void main(String args[]) {
        AreaPoly p;
        p = new Circle(10);
        p.find_area();
        p = new Rectangle(10, 5);
        p.find_area();
        p = new Square(12);
        p.find_area();
    }
}

