package jobsheet6;
import java.util.Scanner;

public class KelulusanMahasiswa04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data nilai mahasiswa
        System.out.println("=== SISTEM PENENTUAN KELULUSAN MAHASISWA ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        // Nilai mata kuliah Algoritma dan Pemrograman
        System.out.println("\n--- Mata Kuliah: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        double utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasAlgo = input.nextDouble();

        // Nilai mata kuliah Struktur Data
        System.out.println("\n--- Mata Kuliah: Struktur Data ---");
        System.out.print("Nilai UTS: ");
        double utsSD = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasSD = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasSD = input.nextDouble();

        // Hitung nilai akhir tiap mata kuliah
        double akhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        double akhirSD = (utsSD * 0.3) + (uasSD * 0.4) + (tugasSD * 0.3);

        // Tentukan status kelulusan per mata kuliah
        String statusAlgo, statusSD;
        if (akhirAlgo >= 60) {
            statusAlgo = "LULUS";
        } else {
            statusAlgo = "TIDAK LULUS";
        }

        if (akhirSD >= 60) {
            statusSD = "LULUS";
        } else {
            statusSD = "TIDAK LULUS";
        }

        // Konversi nilai huruf (opsional tapi sesuai instruksi)
        String gradeAlgo, gradeSD;
        if (akhirAlgo >= 85) gradeAlgo = "A";
        else if (akhirAlgo >= 75) gradeAlgo = "B";
        else if (akhirAlgo >= 65) gradeAlgo = "C";
        else if (akhirAlgo >= 55) gradeAlgo = "D";
        else gradeAlgo = "E";

        if (akhirSD >= 85) gradeSD = "A";
        else if (akhirSD >= 75) gradeSD = "B";
        else if (akhirSD >= 65) gradeSD = "C";
        else if (akhirSD >= 55) gradeSD = "D";
        else gradeSD = "E";

        // Rata-rata nilai akhir kedua mata kuliah
        double rataRata = (akhirAlgo + akhirSD) / 2;

        // Status kelulusan semester (Nested If)
        String statusSemester;
        if (statusAlgo.equals("LULUS") && statusSD.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS SEMESTER";
            } else {
                statusSemester = "TIDAK LULUS SEMESTER (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS SEMESTER (Ada MK tidak lulus)";
        }

        // Output hasil akhir
        System.out.println("\n=== HASIL KELULUSAN MAHASISWA ===");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("\nMata Kuliah Algoritma & Pemrograman:");
        System.out.println("Nilai Akhir : " + akhirAlgo);
        System.out.println("Grade       : " + gradeAlgo);
        System.out.println("Status      : " + statusAlgo);

        System.out.println("\nMata Kuliah Struktur Data:");
        System.out.println("Nilai Akhir : " + akhirSD);
        System.out.println("Grade       : " + gradeSD);
        System.out.println("Status      : " + statusSD);

        System.out.println("\nRata-rata Nilai Akhir : " + rataRata);
        System.out.println("Status Semester       : " + statusSemester);
    }
}
