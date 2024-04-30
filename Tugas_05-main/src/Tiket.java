// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    //Do your magic here
    private double harga;
    private String namaTiket;

    // Constructor
    public Tiket(double harga, String namaTiket) {
        this.harga = harga;
        this.namaTiket = namaTiket;
    }

    /** Untuk mendapatkan nama tiket */
    public double getHarga() {
        return harga;
    }

    /** Untuk mendapatkan nama tiket */
    public String getNamaTiket() {
        return namaTiket;
    }
}