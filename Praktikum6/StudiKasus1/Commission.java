package Praktikum6.StudiKasus1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    //----------------------------------------------------------
    //  Sets up a commission employee using the specified
    //  information.
    //----------------------------------------------------------
    public Commission (String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate,
                      double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
        totalSales = 0; // initial total sales is zero
    }

    //----------------------------------------------------------
    //  Adds the specified amount to this employee's
    //  total sales.
    //----------------------------------------------------------
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    //----------------------------------------------------------
    //  Computes and returns the pay for a commission
    //  employee.
    //----------------------------------------------------------
    public double pay() {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0; // reset total sales for next pay period
        return payment;
    }

    //----------------------------------------------------------
    //  Returns information about a commission employee as a string.
    //----------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
    
}
