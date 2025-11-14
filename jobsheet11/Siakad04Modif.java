package jobsheet11;
import java.util.Scanner;
public class Siakad04Modif {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int mhs = sc.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int mk = sc.nextInt();

        int[][] nilai = new int [mhs] [mk];

        for (int i =0; i< nilai.length; i++){
            System.out.println("\n Input Nilai Mahasiswa Ke-" + (i+1));
            double total =0;
            for (int j =0; j < mk; j++){
                System.out.print("Nilai Mata Kuliah ke-" + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                total += nilai[i][j];
            }
            System.out.printf("Rata-rata: %.2f%n", (total / mk));
        }
        System.out.println("\n=======================================");
        System.out.println("Rata-rata Setiap Mata Kuliah ");
        for (int j = 0; j < mk; j++){
            double total =0;
            for (int i =0; i < mhs; i++){
                total += nilai[i][j];
            }
            System.out.printf("Mata Kuliah " + (j+1) + ": %.2f%n", (total / mhs));
        }
        sc.close();
    }
    
}
