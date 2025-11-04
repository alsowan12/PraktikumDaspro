package jobsheet9;
import java.util.Scanner;
public class ArrayNilaiModif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] Nilaiakhir = new int [10];
        for (int i = 0; i < Nilaiakhir.length; i++){
            System.out.print("Masukkan nilai akhir mahasiswa ke-" +i+ ": ");
            Nilaiakhir[i] = sc.nextInt();
        }for (int i = 0; i < Nilaiakhir.length; i++){
            if (Nilaiakhir[i] >= 70){
                System.out.println("Mahasiswa ke-" +i+ "Lulus");
            }else{
                System.out.println("Mahasiswa ke-" +i+ "Tidak Lulus");
            }{
        sc.close();
        }
    }
    } 
}