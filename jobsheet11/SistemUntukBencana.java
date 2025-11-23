package jobsheet11;
import java.util.Scanner;
import java.util.ArrayList;
public class SistemUntukBencana {
    static class Donasi {
        String namaWilayah;
        double jumlahDonasi;
        String jenisBantuan;
        Donasi(String namaWilayah, double jumlahDonasi, String jenisBantuan) {
            this.namaWilayah = namaWilayah;
            this.jumlahDonasi = jumlahDonasi;
            this.jenisBantuan = jenisBantuan;
        }
static ArrayList<Donasi> daftarDonasi = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int pilihan;
        do {
            System.out.println("\n=== Sistem Pengumpulan dan Analisis Data Donasi Bencana Alam ===");
            System.out.println("1. Donasi");
            System.out.println("2. Lihat Semua Donasi");
            System.out.println("3. Analisis Data Donasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    tambahDonasi(sc);
                    break;
                case 2:
                    lihatDonasi();
                    break;
                case 3:
                    analisisDonasi();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
        sc.close();
    }
    static void tambahDonasi(Scanner sc) {
        System.out.print("Masukkan nama Wilayah: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jumlah donasi: ");
        double jumlah = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Masukkan jenis bantuan (makanan, obat - obatan, pakaian.): ");
        String jenis = sc.nextLine();

        if (jumlah > 0) {
            daftarDonasi.add(new Donasi(nama, jumlah, jenis));
            System.out.println("Donasi berhasil ditambahkan.");
        } else {
            System.out.println("Jumlah donasi harus lebih dari 0.");
        }
    }

    static void lihatDonasi() {
        if (daftarDonasi.isEmpty()) {
            System.out.println("Belum ada donasi yang tercatat.");
        } else {
            System.out.println("\nDaftar Donasi:");
            for (int i = 0; i < daftarDonasi.size(); i++) {
                Donasi d = daftarDonasi.get(i);
                System.out.println((i+1) + ". Wilayah: " + d.namaWilayah + ", Jumlah: Rp" + d.jumlahDonasi + ", Jenis: " + d.jenisBantuan);
            }
        }
    }

    static void analisisDonasi() {
        if (daftarDonasi.isEmpty()) {
            System.out.println("Belum ada data donasi untuk dianalisis.");
        } else {
            double total = 0;
            double max = 0;
            String donorMax = "";
            int count = daftarDonasi.size();

            for (Donasi d : daftarDonasi) {
                total += d.jumlahDonasi;
                if (d.jumlahDonasi > max) {
                    max = d.jumlahDonasi;
                    donorMax = d.namaWilayah;
                }
            }

            double rataRata = total / count;

            System.out.println("\nAnalisis Data Donasi: ");
            System.out.println("Total Donasi : Rp" + total);
            System.out.println("Rata-rata Donasi : Rp" + rataRata);
            System.out.println("Wilayah dengan donasi tertinggi: " + donorMax + " (Rp" + max + ")");
            System.out.println("Jumlah Wilayah: " + count);
        }
    }
}
}