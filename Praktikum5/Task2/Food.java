package Praktikum5.Task2;

public class Food extends Goods {
    private int calories;

    public Food(String description, double price, int calories) {
        // Memanggil konstruktor superclass
        super(description, price);
        this.calories = calories;
    }

    // Meng-override metode display() untuk menambahkan informasi kalori
    @Override
    public void display() {
        super.display();
        System.out.println("Kalori: " + calories);
    }

    // Getter and Setter
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}