package Praktikum4.Modul.Task1;

public class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor dengan radius
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }
    
    // Constructor dengan radius dan color
    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Menghitung luas lingkaran
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
