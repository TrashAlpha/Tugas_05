// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   // Do your magic here
   public VIP(boolean isPresale) {
      super(isPresale ? (150.0 * 0.80) : 150.0, "VIP");
  }
}