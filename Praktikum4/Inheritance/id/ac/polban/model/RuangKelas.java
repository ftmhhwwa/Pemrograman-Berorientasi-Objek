package Praktikum4.Inheritance.id.ac.polban.model;

public class RuangKelas extends Ruangan {
    public RuangKelas(String kodeRuang, String namaGedung, String ruangan, int kapasitas) {
        super(kodeRuang, namaGedung, ruangan, kapasitas);
    }

    @Override
    public void infoRuang() {
        System.out.println("Kode: " + kodeRuang +
                           " | Gedung: " + namaGedung +
                           " | Ruangan: " + ruangan +
                           " | Kapasitas: " + kapasitas +
                           " | Status: " + (terpakai ? "Terpakai" : "Kosong"));
    }
}