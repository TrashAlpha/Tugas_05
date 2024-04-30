// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here
    public VVIP(boolean isPresale) {
        super(isPresale ? (200.0 * 0.80) : 200.0, "VVIP");
    }
}