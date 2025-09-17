package Praktikum4.Inheritance.id.ac.polban.model;

public class RuangLab extends Ruangan {
    private int jumlahKomputer;

    public RuangLab(String kodeRuang, String namaGedung, String ruangan, int kapasitas, int jumlahKomputer) {
        super(kodeRuang, namaGedung, ruangan, kapasitas);
        this.jumlahKomputer = jumlahKomputer;
    }
    
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }

    @Override
    public void infoRuang() {
        System.out.println("Kode: " + kodeRuang +
                           " | Gedung: " + namaGedung +
                           " | Ruangan: " + ruangan +
                           " | Kapasitas: " + kapasitas +
                           " | Komputer: " + jumlahKomputer +
                           " | Status: " + (terpakai ? "Terpakai" : "Kosong"));
    }
}