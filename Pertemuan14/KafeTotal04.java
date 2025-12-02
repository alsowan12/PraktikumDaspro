package Pertemuan14;
import java.util.Scanner;
public class KafeTotal04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah member? (iya/tidak) : ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine(); // Membersihkan newline
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        
        Menu(namaPelanggan, isMember, kodePromo, sc);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo, Scanner sc) {
        System.out.println("Selamat datang. " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi Hitam - Rp 15,000 ");
        System.out.println("2. Cappuccino - Rp 20,000 ");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 12,000 ");
        System.out.println("6. Mie Goreng  - Rp 18,000");
        System.out.println("============================="); 
        System.out.println("Silahkan Pilih Yang Anda Inginkan");

        System.out.print("\nMasukkan jumlah jenis menu yang ingin dipesan: ");
        int jumlahJenisMenu = sc.nextInt();
        
        int totalHargaSemua = 0;
        
        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.println("\nPesanan ke-" + i + ":");
            System.out.print("Masukkan nomor menu yang dipilih: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan banyak item yang dibeli: ");
            int banyakItem = sc.nextInt();
            
            int hargaMenu = hitungTotalHarga(pilihanMenu, banyakItem);
            totalHargaSemua += hargaMenu;
            
            System.out.println("Harga untuk pesanan ini: Rp " + hargaMenu);
        }
        totalHargaSemua = applyDiskonPromo(totalHargaSemua, kodePromo);
    
        if (isMember) {
            int diskonMember = totalHargaSemua * 10 / 100;
            totalHargaSemua -= diskonMember;
            System.out.println("\nDiskon member 10%: Rp " + diskonMember);
        }

        System.out.println("\n=================================");
        System.out.println("Total harga keseluruhan yang harus dibayar: Rp " + totalHargaSemua);
        System.out.println("=================================");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) { 
        int[] hargaItems = {15000, 20000, 22000, 12000, 12000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;    
    }
    
    public static int applyDiskonPromo(int totalHarga, String kodePromo) { 
        if (kodePromo.equals("DISKON50")) {
            int diskon = totalHarga * 50 / 100;
            totalHarga -= diskon;
            System.out.println("\nSelamat! Anda mendapatkan diskon 50%: Rp " + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            int diskon = totalHarga * 30 / 100;
            totalHarga -= diskon;
            System.out.println("\nSelamat! Anda mendapatkan diskon 30%: Rp " + diskon);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("\nKode promo invalid.");
        }
        
        return totalHarga;
    } 
}