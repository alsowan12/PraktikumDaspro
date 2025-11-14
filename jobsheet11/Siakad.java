package jobsheet11;
import java.util.Scanner;
public class Siakad {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int [][] nilai = new int [4] [3];
        for (int i = 0; i < nilai.length; i++){
            System.out.println("Input Nilai Mahasiswa Ke-" + (i+1));
            double totalPersiswa = 0;
            for (int j = 0; j < nilai[i].length; j++){
                System.out.print("Nilai Mata Kuliah ke-" + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata-Rata: " + (totalPersiswa / 3));
        }

        System.out.println("\n=======================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah");

        for (int j = 0; j < 3; j++){
            double totalPermatkul = 0;
            for (int i = 0; i < 4; i++){
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + (totalPermatkul / 4));
        }
        sc.close();
    }
}
