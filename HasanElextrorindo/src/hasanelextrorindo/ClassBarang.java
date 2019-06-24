package hasanelextrorindo;

public class ClassBarang {
    String idBarang, namaBarang, Jenis, Satuan;
    int hargaBeli, hargaJual, Stok;

    public ClassBarang(String idBarang, String namaBarang, String Jenis, String Satuan, int hargaBeli, int hargaJual, int Stok) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.Jenis = Jenis;
        this.Satuan = Satuan;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.Stok = Stok;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getJenis() {
        return Jenis;
    }

    public String getSatuan() {
        return Satuan;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public int getStok() {
        return Stok;
    }

}
