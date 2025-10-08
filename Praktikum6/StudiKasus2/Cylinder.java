package Praktikum6.StudiKasus2;

public class Cylinder extends Shape
{
    private double radius;
    private double height;

    //----------------------------------------------------------
    // Constructor: Menyiapkan silinder.
    //----------------------------------------------------------
    public Cylinder (double r, double h)
    {
        super ("Cylinder");
        radius = r;
        height = h;
    }

    //----------------------------------------------------------
    // Mengembalikan luas permukaan silinder (berdasarkan formula soal).
    //----------------------------------------------------------
    public double area()
    {
        // Catatan: Ini adalah formula volume silinder. Mengikuti
        return Math.PI * radius * radius * height; 
    }

    //----------------------------------------------------------
    // Mengembalikan silinder sebagai String.
    //----------------------------------------------------------
    public String toString()
    {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}