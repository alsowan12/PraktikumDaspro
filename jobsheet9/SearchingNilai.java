package jobsheet9;
import java.util.Scanner;

public class SearchingNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMhs = sc.nextInt();

        int[] arrNilai = new int[jmlhMhs];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " Nilai yang dicari tidak ditemukan");
        }

        sc.close();
    }
}
