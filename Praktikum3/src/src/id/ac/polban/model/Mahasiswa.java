package id.ac.polban.model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
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

    public void infoMahasiswa() {
        System.out.println("Nama: " + nama + "  \nNIM: " + nim + "  \nJurusan: " + jurusan);
    }
}
