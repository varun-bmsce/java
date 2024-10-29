
abstract class Shape {
    int dimension1;
    int dimension2;


    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }


    abstract void printArea();
}


class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }


    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Rectangle Area: " + area);
    }
}


class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }


    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, radius);
    }


    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Circle Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 5);
        triangle.printArea();

        Shape circle = new Circle(7);
        circle.printArea();
    }
}