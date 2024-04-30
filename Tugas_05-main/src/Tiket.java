// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    //Do your magic here
    private double harga;
    private String namaTiket;

    public Tiket(double harga, String namaTiket) {
        this.harga = harga;
        this.namaTiket = namaTiket;
    }

    public double getHarga() {
        return harga;
    }

    public String getNamaTiket() {
        return namaTiket;
    }
}