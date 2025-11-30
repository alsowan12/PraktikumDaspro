package Pertemuan14.Tugas;
import java.util.Scanner;

public class RekapPenjualanCafe04 {
    
    public static void inputDataPenjualan(String[] menu, int[][] penjualan) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nInput data penjualan untuk " + menu[i] + ":");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void tampilDataPenjualan(String[] menu, int[][] penjualan) {
        System.out.println("\n=== REKAP PENJUALAN KAFE ===");
        System.out.printf("%-15s", "Menu");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.printf("Hari %-3d", (j + 1));
        }
        System.out.println();
        
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-8d", penjualan[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void tampilMenuTertinggi(String[] menu, int[][] penjualan) {
        int maxTotal = 0;
        String menuTerbaik = "";
        
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            
            if (total > maxTotal) {
                maxTotal = total;
                menuTerbaik = menu[i];
            }
        }
        
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menuTerbaik);
        System.out.println("Total Penjualan: " + maxTotal);
    }
    
    public static void tampilRataRataPerMenu(String[] menu, int[][] penjualan) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / penjualan[i].length;
            System.out.printf("%-15s: %.2f\n", menu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();
        
        String[] menu = new String[jumlahMenu];
        System.out.println("\nMasukkan nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
        
        int[][] penjualan = new int[jumlahMenu][jumlahHari];
        
        inputDataPenjualan(menu, penjualan);
        tampilDataPenjualan(menu, penjualan);
        tampilMenuTertinggi(menu, penjualan);
        tampilRataRataPerMenu(menu, penjualan);
    }
}