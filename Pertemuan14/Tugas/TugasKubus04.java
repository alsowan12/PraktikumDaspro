package Pertemuan14.Tugas;

import java.util.Scanner;

public class TugasKubus04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sisi kubus: ");
        int sisi = input.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus adalah: " + volume);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);

        input.close();
    }

    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }
}
