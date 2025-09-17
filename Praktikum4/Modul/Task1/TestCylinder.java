package Praktikum4.Modul.Task1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1: "
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
        System.out.println(c1.toString());

        Cylinder c2 = new Cylinder(10.0, 5.0, "blue");
        System.out.println("\nCylinder 2: "
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
        System.out.println(c2.toString());
    }
}