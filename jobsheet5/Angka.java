package jobsheet5;
import java.util.Scanner;

public class Angka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah Genap");
        } else {
            System.out.println("Angka " + angka + " adalah Ganjil");
        }

        input.close();
    }
}

