package Praktikum6.StudiKasus2;

//**************************************************************
// Paint.java
//
// Represents a type of paint that has a fixed area
// covered by gallon. All measurements are in feet.
//**************************************************************

public class Paint 
{
    private double coverage;

    //----------------------------------------------------------
    // Constructor: Sets up the paint object.
    //----------------------------------------------------------
    public Paint (double c)
    {
        coverage = c;
    }

    //----------------------------------------------------------
    // Returns the amount of paint (number of gallons)
    // needed to paint the shapee given as the parameter.
    //----------------------------------------------------------
    public double amount (Shape s)
    {
        System.out.println ("Computing amount for " + s);
        return s.area() / coverage;
    }
}

