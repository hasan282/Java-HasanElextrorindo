package hasanelextrorindo;

public class ClassPelanggan {
    String idPel, namaPel, Alamat, Telpon, eMail;

    public ClassPelanggan(String idPel, String namaPel, String Alamat, String Telpon, String eMail) {
        this.idPel = idPel;
        this.namaPel = namaPel;
        this.Alamat = Alamat;
        this.Telpon = Telpon;
        this.eMail = eMail;
    }

    public String getIdPel() {
        return idPel;
    }

    public String getNamaPel() {
        return namaPel;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getTelpon() {
        return Telpon;
    }

    public String geteMail() {
        return eMail;
    }

}
