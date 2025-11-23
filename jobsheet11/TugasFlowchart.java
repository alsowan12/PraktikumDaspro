package jobsheet11;
import java.util.Scanner;

public class TugasFlowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int KOTA = 5;      
        final int HARI = 7;     

        double[][] suhu = new double[KOTA][HARI];

        
        for (int k = 0; k < KOTA; k++) {
            for (int h = 0; h < HARI; h++) {
                System.out.printf("Suhu kota-%d hari-%d : ", (k + 1), (h + 1));
                suhu[k][h] = sc.nextDouble();
            }
        }

    
        System.out.println("\nData suhu 5 kota × 7 hari:");
        for (int k = 0; k < KOTA; k++) {
            for (int h = 0; h < HARI; h++) {
                System.out.print(suhu[k][h] + "\t");
            }
            System.out.println();   
        }

        sc.close();
    }
}