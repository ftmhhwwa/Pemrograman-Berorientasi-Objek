package Praktikum6.StudiKasus1;

//**************************************************************
// Hourly.java
//
// Represents an employee that gets paid by the hour
//**************************************************************

public class Hourly extends Employee
{
    private int hoursWorked;
    
    //----------------------------------------------------------
    //  Sets up an hourly employee with the specified information.
    //----------------------------------------------------------
    public Hourly (String eName, String eAddress, String ePhone,
                   String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //----------------------------------------------------------
    //  Adds the specified number of hours to this employee's
    //  total hours worked.
    //----------------------------------------------------------
    public void addHours (int moreHours)
    {
        hoursWorked += moreHours;
    }

    //----------------------------------------------------------
    //  Computes and returns the pay for this hourly employee.
    //----------------------------------------------------------
    public double pay()
    {
        double payment = super.pay() * hoursWorked;

        hoursWorked = 0;  // reset hours worked

        return payment;
    }

    //----------------------------------------------------------
    //  Returns information about an hourly employee as a string.
    //----------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nHours Worked: " + hoursWorked;
        return result;
    }
}