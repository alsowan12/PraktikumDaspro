package jobsheet8;
import java.util.Scanner;

public class KopiSenja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = input.nextInt();

        int totalPelangganSemuaCabang = 0;
        int totalItemSemuaCabang = 0;

        System.out.println("\n=== Input Data Penjualan Harian Kopi Senja ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\nCabang ke-" + i + ":");
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int jumlahPelanggan = input.nextInt();

            int totalItemPerCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah item yang dipesan oleh pelanggan ke-" + j + ": ");
                int item = input.nextInt();
                totalItemPerCabang += item;
            }

            System.out.println("Total item terjual di cabang ke-" + i + ": " + totalItemPerCabang);

            totalPelangganSemuaCabang += jumlahPelanggan;
            totalItemSemuaCabang += totalItemPerCabang;
        }

        System.out.println("\n=== Ringkasan Penjualan Hari Ini ===");
        System.out.println("Total seluruh pelanggan: " + totalPelangganSemuaCabang);
        System.out.println("Total seluruh item terjual: " + totalItemSemuaCabang);

        input.close();
    }
}
