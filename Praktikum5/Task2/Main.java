package Praktikum5.Task2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari setiap kelas
        Food nasiGoreng = new Food("Nasi Goreng", 25000, 500);
        Toy mobilMainan = new Toy("Mobil Mainan", 50000, 3);
        Book fiksi = new Book("Buku Fiksi", 120000, "J.K. Rowling");

        System.out.println("--- Informasi Produk ---");

        // Menampilkan informasi Food
        System.out.println("\nProduk: Makanan");
        nasiGoreng.display();

        // Menampilkan informasi Toy
        System.out.println("\nProduk: Mainan");
        mobilMainan.display();
        System.out.println("Pajak: Rp" + mobilMainan.calculateTax());

        // Menampilkan informasi Book
        System.out.println("\nProduk: Buku");
        fiksi.display();
        System.out.println("Pajak: Rp" + fiksi.calculateTax());
    }
}
