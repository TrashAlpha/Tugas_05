import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Do your magic here

        /** Memasukkan nama pembeli */
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = input.nextLine();

        /** Tampilan opsi untuk memilih tahap pembelian */
        System.out.println("\nPilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");

        /** Memasukkan pilihan dari opsi tahap pembelian */
        int pilihan = input.nextInt();

        switch (pilihan) {

            /** Apabila memilih 1(Presale), maka program berikut yang dijalankan */
            case 1:
                /** Tampilan opsi untuk memilih jenis tiket */
                System.out.println("\nPilih jenis tiket: ");
                System.out.println("1. VIP");
                System.out.println("2. VVIP");
                System.out.print("Pilih jenis tiket (1/2): ");

                /** Memasukkan pilihan dari opsi jenis tiket */
                int opsiTiketPresale = input.nextInt();

                switch (opsiTiketPresale) {

                    /** Apabila memilih 1(VIP), maka program berikut yang dijalankan */
                    case 1:
                        /** Input untuk jumlah tiket */
                        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
                        int jumlahTiketPsVIP = input.nextInt();

                        /** Membuat objek dengan class VIP dengan tipe data superclassnya, yaitu Tiket (Polymorphism) */
                        Tiket tiketPsVIP = new VIP(true);

                        /** Instansiasi Pemesanan */
                        Pemesanan pesan1 = new Pemesanan(namaPembeli, "Presale", tiketPsVIP, jumlahTiketPsVIP);
                        pesan1.cetakNota(); // Memanggil method cetakNota dari class Pemesanan untuk mengeprint nota
                        
                        break;
                    
                    /** Apabila memilih 2(VVIP), maka program berikut yang dijalankan */
                    case 2:
                        /** Input untuk jumlah tiket */
                        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
                        int jumlahTiketPsVVIP = input.nextInt();

                        /** Membuat objek dengan class VVIP dengan tipe data superclassnya, yaitu Tiket (Polymorphism) */
                        Tiket tiketPsVVIP = new VVIP(true);

                        /** Instansiasi Pemesanan */
                        Pemesanan pesan2 = new Pemesanan(namaPembeli, "Presale", tiketPsVVIP, jumlahTiketPsVVIP);
                        pesan2.cetakNota(); // Memanggil method cetakNota dari class Pemesanan untuk mengeprint nota

                        break;

                    /** Keluar dari sistem apabila input tidak ada di dalam opsi */
                    default:
                        System.out.println("Input tidak valid!");
                        System.exit(opsiTiketPresale);
                        break;
                }
                
                break;
            
            /** Apabila memilih 2(Regular), maka program berikut yang dijalankan */
            case 2:
                /** Tampilan opsi untuk memilih jenis tiket */
                System.out.println("\nPilih jenis tiket: ");
                System.out.println("1. Festival");
                System.out.println("2. VIP");
                System.out.println("3. VVIP");
                System.out.print("Pilih jenis tiket (1/2/3): ");
                
                /** Memasukkan pilihan dari opsi jenis tiket */
                int opsiTiketReguler = input.nextInt();

                switch (opsiTiketReguler) {
                    
                    /** Apabila memilih 1(Festival), maka program berikut yang dijalankan */
                    case 1:
                        /** Input untuk jumlah tiket */
                        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
                        int jumlahTiketRgFestival = input.nextInt();

                        /** Membuat objek dengan class Festival dengan tipe data superclassnya, yaitu Tiket (Polymorphism) */
                        Tiket tiketRgFestival = new Festival();

                        /** Instansiasi Pemesanan */
                        Pemesanan pesan3 = new Pemesanan(namaPembeli, "Regular", tiketRgFestival, jumlahTiketRgFestival);
                        pesan3.cetakNota(); // Memanggil method cetakNota dari class Pemesanan untuk mengeprint nota
                        
                        break;
                    
                    /** Apabila memilih 2(VIP), maka program berikut yang dijalankan */
                    case 2:
                        /** Input untuk jumlah tiket */
                        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
                        int jumlahTiketRgVIP = input.nextInt();

                        /** Membuat objek dengan class VIP dengan tipe data superclassnya, yaitu Tiket (Polymorphism) */
                        Tiket tiketRgVIP = new VIP(false);

                        /** Instansiasi Pemesanan */
                        Pemesanan pesan4 = new Pemesanan(namaPembeli, "Regular", tiketRgVIP, jumlahTiketRgVIP);
                        pesan4.cetakNota(); // Memanggil method cetakNota dari class Pemesanan untuk mengeprint nota

                        break;
                    
                    /** Apabila memilih 3(VVIP), maka program berikut yang dijalankan */
                    case 3:
                        /** Input untuk jumlah tiket */
                        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
                        int jumlahTiketRgVVIP = input.nextInt();

                        /** Membuat objek dengan class VVIP dengan tipe data superclassnya, yaitu Tiket (Polymorphism) */
                        Tiket tiketRgVVIP = new VVIP(false);

                        /** Instansiasi Pemesanan */
                        Pemesanan pesan5 = new Pemesanan(namaPembeli, "Regular", tiketRgVVIP, jumlahTiketRgVVIP);
                        pesan5.cetakNota(); // Memanggil method cetakNota dari class Pemesanan untuk mengeprint nota

                        break;

                    /** Keluar dari sistem apabila input tidak ada di dalam opsi */
                    default:
                        System.out.println("Input tidak valid!");
                        System.exit(opsiTiketReguler);
                        break;
                }
                break;
            
            /** Keluar dari sistem apabila input tidak ada di dalam opsi */
            default:
                System.out.println("Input tidak valid!");
                System.exit(pilihan);
                break;
        }
        input.close();
    }
}