package Pertemuan14.Tugas;
import java.util.Scanner;

public class NilaiMahasiswa04 {
    
    public static void isianArray(double[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
        }
    }
    
    public static void tampilArray(double[] nilai) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }
    
    public static double hitTot(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = scanner.nextInt();
        
        double[] nilaiMahasiswa = new double[N];
        
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        double totalNilai = hitTot(nilaiMahasiswa);
        
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
    }
}