// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   // Do your magic here

   // Constructor
   /** Apabila parameter VIP bernilai true, maka akan mengembalikan nilai double yaitu 80% dari 150.0. Namun, apabila false maka akan mengembalikan 150.0 */
   /** Parameter constructor superclass bagian String namaTiket diisi dengan "VIP" */
   public VIP(boolean isPresale) {
      super(isPresale ? (150.0 * 0.80) : 150.0, "VIP");
  }
}