package Praktikum5.Task2;

public class Book extends Goods implements Taxable {
    private String author;

    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }

    // Mengimplementasikan metode dari interface Taxable
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    // Meng-override metode display() untuk menambahkan informasi penulis
    @Override
    public void display() {
        super.display();
        System.out.println("Penulis: " + author);
    }

    // Getter and Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
