package Praktikum4.Modul.Task1;

public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter dan Setter untuk height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    // Overriding getArea() untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        // Luas permukaan = 2 * Luas alas + Luas selimut
        return 2 * super.getArea() + 2 * Math.PI * getRadius() * height;
    }

    // Memperbaiki getVolume() agar menggunakan getArea() dari superclass
    public double getVolume() {
        return super.getArea() * height;
    }
    
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}