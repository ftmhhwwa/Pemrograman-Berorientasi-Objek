package Praktikum5.Task2;

public class Toy extends Goods implements Taxable {
    private int minimumAge;

    public Toy(String description, double price, int minimumAge) {
        super(description, price);
        this.minimumAge = minimumAge;
    }

    // Mengimplementasikan metode dari interface Taxable
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    // Meng-override metode display() untuk menambahkan informasi usia
    @Override
    public void display() {
        super.display();
        System.out.println("Usia Minimum: " + minimumAge + " tahun");
    }

    // Getter and Setter
    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }
}
