package jobsheet6;
import java.util.Scanner;

public class KelulusanMahasiswa4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENENTUAN KELULUSAN MAHASISWA ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String NIM = input.nextLine();

        System.out.println("\n--- Mata Kuliah : Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        double utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasAlgo = input.nextDouble();
      

        System.out.println("\n--- Mata Kuliah : Struktur Data ---");
        System.out.print("Nilai UTS: ");
        double utsSD = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasSD = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasSD = input.nextDouble();

        System.out.println("\n--- Mata Kuliah : Basis Data ---");
        System.out.print("Nilai UTS: ");
        double utsBD = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasBD = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasBD = input.nextDouble();
        
        double akhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        double akhirSD = (utsSD * 0.3) + (uasSD * 0.4) + (tugasSD * 0.3);
        double akhirBD = (utsBD * 0.3) + (uasBD * 0.4) + (tugasBD * 0.3);

        String statusAlgo = (akhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusSD = (akhirSD >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusBD = (akhirBD >= 60) ? "LULUS" : "TIDAK LULUS";

        String gradeAlgo,gradeSD,gradeBD;

        if (akhirAlgo >= 80) gradeAlgo = "A";
        else if (akhirAlgo >= 73) gradeAlgo = "B+";
        else if (akhirAlgo >= 65) gradeAlgo = "B";
        else if (akhirAlgo >= 60) gradeAlgo = "C+";
        else if (akhirAlgo >= 50) gradeAlgo = "C";
        else if (akhirAlgo >= 39) gradeAlgo = "D";
        else gradeAlgo = "E";

        if (akhirSD >= 80) gradeSD = "A";
        else if (akhirSD >= 73) gradeSD = "B+";
        else if (akhirSD >= 65) gradeSD = "B";
        else if (akhirSD >= 60) gradeSD = "C+";
        else if (akhirSD >= 50) gradeSD = "C";
        else if (akhirSD >= 39) gradeSD = "D";
        else  gradeSD = "E";

        if (akhirBD >= 80) gradeBD = "A";
        else if (akhirBD >= 73) gradeBD = "B+";
        else if (akhirBD >= 65) gradeBD = "B";
        else if (akhirBD >= 60) gradeBD = "C+";
        else if (akhirBD >= 50) gradeBD = "C";
        else if (akhirBD >= 39) gradeBD = "D";
        else  gradeBD = "E";

        double rataRata = (akhirAlgo + akhirSD + akhirBD) / 3;
String statusSemester;
        if (rataRata >= 70) {
            statusSemester = "LULUS SEMESTER";
        } else if (rataRata >= 60) {
            statusSemester = "LULUS BERSYARAT";
        } else {
            statusSemester = "TIDAK LULUS SEMESTER";
        }

        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + NIM);
        System.out.println("Mata Kuliah            UTS   UAS   Tugas   Nilai Akhir   Nilai Huruf   Status");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Algoritma Pemrograman", utsAlgo, uasAlgo, tugasAlgo, akhirAlgo, gradeAlgo, statusAlgo, statusAlgo);
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Struktur Data", utsSD, uasSD, tugasSD, akhirSD, gradeSD, statusSD, statusSD);
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Basis Data", utsBD, uasBD, tugasBD, akhirBD, gradeBD, statusBD, statusBD);
        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rataRata);
        System.out.printf("Status Semester       : %s\n", statusSemester);


        input.close();
    }
}
