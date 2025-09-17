package Praktikum4.Inheritance.id.ac.polban.model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

   // atribut static untuk menghitung total mahasiswa
    private static int totalMahasiswa = 0;
    
    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        totalMahasiswa++;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

   // Tambahkan metode static untuk mendapatkan total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
    
    public void infoMahasiswa() {
        System.out.println("Nama: " + nama + "  \nNIM: " + nim + "  \nJurusan: " + jurusan);
    }
}
