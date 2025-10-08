package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        
        boolean uktLunas = input.nextBoolean();

        // Versi IF-ELSE
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Silakan lunasi UKT terlebih dahulu agar bisa mencetak KRS.");
        }

        // 🔽 Tambahan: Versi Ternary Operator
        String hasil = (uktLunas) 
            ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
            : "Silakan lunasi UKT terlebih dahulu agar bisa mencetak KRS.";
        
        System.out.println("\n=== Versi Ternary Operator ===");
        System.out.println(hasil);

        input.close();
    }
}
