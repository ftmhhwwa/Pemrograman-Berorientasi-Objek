package Praktikum5.Task2;

public class Goods {
    private String description;
    private double price;

    public Goods(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Metode untuk menampilkan informasi dasar
    public void display() {
        System.out.println("Deskripsi: " + description);
        System.out.println("Harga: Rp" + price);
    }

    // Getters and Setters (untuk memenuhi prinsip enkapsulasi)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
