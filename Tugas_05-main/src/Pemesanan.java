// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        // Do your magic here

        /** Menghitung total harga */
        double totalHarga = tiket.getHarga() * jumlah;

        /** Output untuk nota */
        System.out.println("\n--- Nota Pembelian ---");
        System.out.println("Nama Pembeli: " + this.nama);
        System.out.println("Tahap Pembelian: " + this.tahap);
        System.out.println("Jenis Tiket: " + this.tiket.getNamaTiket());
        System.out.println("Jumlah Tiket: " + this.jumlah);
        System.out.printf("Total Harga: Rp %.1f", totalHarga );
    }
}
