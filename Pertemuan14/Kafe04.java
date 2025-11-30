package Pertemuan14;
import java.util.Scanner;
public class Kafe04 {
public static void Menu(String namaPelanggan, boolean isMember) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Selamat datang. "  + namaPelanggan + "!");
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

System.out.print("\nMasukkan nomor menu yang dipilih:");
int pilihanMenu = sc.nextInt();
System.out.print("Masukkan banyak item yang dibeli:");
int banyakItem = sc.nextInt();

int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

System.out.println("Total harga untuk dipesan adalah: Rp " + totalHarga);

    
}
public static void main(String[] args) {
    
}

public static int hitungTotalHarga(int pilihanMenu, int banyakItem) { 
    int [] hargaItems = {15000, 20000, 22000, 12000, 12000, 18000};
    int hargaTotal = hargaItems [pilihanMenu - 1] * banyakItem;
    return hargaTotal;    
} 

}
