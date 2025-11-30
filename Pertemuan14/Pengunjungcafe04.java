package Pertemuan14;

public class Pengunjungcafe04 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar nama pengunjung");
        for (int i = 0; i < namaPengunjung.length; i++){
            System.out.println("- " + namaPengunjung[i]);

            daftarPengunjung("Ali", "Budi","Citra");
            daftarPengunjung("Andi");
            daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

            

        }
    }
    
}
