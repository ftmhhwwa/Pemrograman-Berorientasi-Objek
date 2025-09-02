/**
 * Class RuangKelas merepresentasikan ruangan kuliah.
 */
public class RuangKelas {
    private String kodeRuang;
    private String namaGedung;
    private int kapasitas;
    private boolean terpakai;

    public RuangKelas(String kodeRuang, String namaGedung, int kapasitas) {
        this.kodeRuang = kodeRuang;
        this.namaGedung = namaGedung;
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

    public void infoRuang() {
        System.out.println("Kode: " + kodeRuang +
                           " | Gedung: " + namaGedung +
                           " | Kapasitas: " + kapasitas +
                           " | Status: " + (terpakai ? "Terpakai" : "Kosong"));
    }
}
