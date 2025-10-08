package Praktikum6.StudiKasus2;

public class Rectangle extends Shape
{
    private double length;
    private double width;

    //----------------------------------------------------------
    // Constructor: Menyiapkan persegi panjang.
    //----------------------------------------------------------
    public Rectangle (double l, double w)
    {
        super ("Rectangle");
        length = l;
        width = w;
    }

    //----------------------------------------------------------
    // Mengembalikan luas persegi panjang.
    //----------------------------------------------------------
    public double area()
    {
        return length * width;
    }

    //----------------------------------------------------------
    // Mengembalikan persegi panjang sebagai String.
    //----------------------------------------------------------
    public String toString()
    {
        return super.toString() + " of length " + length + " and width " + width;
    }
}