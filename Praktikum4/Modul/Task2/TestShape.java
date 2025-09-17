package Praktikum4.Modul.Task2;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("---------------Menguji Shape----------------");
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

        System.out.println("---------------Menguji Circle----------------");
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.5, "blue", true);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        System.out.println("---------------Menguji Rectangle----------------");
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        System.out.println("---------------Menguji Square----------------");
        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(5.0, "purple", true);
        System.out.println(square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
    }
    
}
