package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlhMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlhMhs];
        double totalLulus = 0, totalTidaklulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidaklulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double ratalulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? totalTidaklulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + ratalulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

        sc.close();
    }
}
