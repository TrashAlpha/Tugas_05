// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here

    // Constructor
    /** Apabila parameter VIP bernilai true, maka akan mengembalikan nilai double yaitu 80% dari 200.0. Namun, apabila false maka akan mengembalikan 200.0 */
    /** Parameter constructor superclass bagian String namaTiket diisi dengan "VVIP" */
    public VVIP(boolean isPresale) {
        super(isPresale ? (200.0 * 0.80) : 200.0, "VVIP");
    }
}