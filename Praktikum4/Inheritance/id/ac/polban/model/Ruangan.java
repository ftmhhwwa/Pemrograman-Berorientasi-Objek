package Praktikum4.Inheritance.id.ac.polban.model;

public abstract class Ruangan {
    protected String kodeRuang;
    protected String namaGedung;
    protected String ruangan;
    protected int kapasitas;
    protected boolean terpakai;

    public Ruangan(String kodeRuang, String namaGedung, String ruangan, int kapasitas) {
        this.kodeRuang = kodeRuang;
        this.namaGedung = namaGedung;
        this.ruangan = ruangan;
        this.kapasitas = kapasitas;
        this.terpakai = false;
    }

    public boolean isTerpakai() {
        return terpakai;
    }

    public String getKodeRuang() {
        return kodeRuang;
    }

    public void pinjamRuang() {
        terpakai = true;
    }

    public void kosongkanRuang() {
        terpakai = false;
    }

    public abstract void infoRuang();
}
