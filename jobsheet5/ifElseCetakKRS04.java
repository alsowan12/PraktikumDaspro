package jobsheet5;

import java.util.Scanner;

public class ifElseCetakKRS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (semester == 1) {
            System.out.println("=== KRS Semester 1 ===");
            if (uktLunas) {
                System.out.println("Pembayaran UKT terverifikasi");
                System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
            } else {
                System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
            }
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else {
            System.out.println("KRS Semester 7 atau lebih ditampilkan");
        }

        System.out.println("Terima Kasih");
        sc.close();
    }
}
