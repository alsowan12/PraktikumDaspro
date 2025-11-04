package jobsheet9;
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int [] nilai = new int [jumlah];
        int total = 0;
        int tertinggi = Integer.MIN_VALUE;
        int terendah = Integer.MAX_VALUE;

        for   (int i=0; i<nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if (nilai[i] > tertinggi){
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah){
                terendah = nilai[i];
            }   
           
            }
            double rataRata = (double) total / nilai.length;
             for (int i=0; i< nilai.length; i++){
                if (nilai[i] == tertinggi){
                    System.out.println("Nilai tertinggi Mahasiswa ke-"+i+" dengan nilai "+nilai[i]);
                }
            System.out.println("\nNilai rata rata: " + rataRata);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            sc.close();

        }
    }
        
    

    
}
   