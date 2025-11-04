Pertanyaan 2.1

1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

Jawaban : Jika elemen array bil diubah dengan angka seperti di soal maka code akan error.

Penjelasan : Karena pada code saya disitu variabelnya int bukan double int mencangkup beberapa variabel berbeda dengan double int itu 32 bit sedangkan double 64 bit 

2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.

Jawaban : 

3. Ubah statement pada langkah No 4 menjadi seperti berikut Apa keluaran dari program? Jelaskan maksud dari statement tersebut.

Jawaban : Program yang dikeluarkan oleh code tersebut tetap sama.

Penjelasan : 1. int i = 0 → variabel i digunakan sebagai indeks untuk mengakses elemen array, dimulai dari 0 (elemen pertama).

             2. i < 4 → perulangan berjalan selama nilai i kurang dari 4 (karena array memiliki 4 elemen: indeks 0–3).

             3. i++ → setiap kali satu putaran selesai, nilai i bertambah 1.

             4. System.out.println(bil[i]); → menampilkan isi elemen array bil berdasarkan indeks i saat ini ke layar.


4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

Jawaban : Maka program akan error atau tidak akan ada output yang dikeluarkan.

Penjelasan : Karena indeks 4 tidak valid untuk array berukuran 4 elemen (indeks maksimal 3).



Pertanyaan 2.2

1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
for (int i = 0; i < NilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai akhir ke-"+i+":);
    nilaiAkhir[i] = sc.nextint();
}


Jawaban : Didalam program tidak akan ada perubahan.


Penjelasan : Karena dari program tersebut variabel int adalah 10 sama dengan Nilaiakhir dengan kata lain VAriabel Nilaiakhir adalah 10 


2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?

Jawaban : Kondisi i < nilaiAkhir.length digunakan untuk mengontrol batas perulangan agar tidak melebihi jumlah elemen array.
Dengan begitu, kamu tidak akan mengakses indeks yang tidak ada (karena kalau itu terjadi, program akan error:
ArrayIndexOutOfBoundsException).


3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): Jalankan program dan jelaskan alur program!

Penjelasan : 

1. Program membuat array Nilaiakhir berukuran 10.

2. Mengisi array dengan input nilai dari pengguna.

Mengecek setiap nilai:

1. Jika nilai ≥ 70 → mahasiswa lulus, tampilkan nilainya.

2. Jika nilai < 70 → tidak ditampilkan.


4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:


Pertanyaan 2.3 

1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).


2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:


Pertanyaan 2.4 

1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas

Jawaban : Break memiliki fungsi sebagai jika nilai key sudah ditentukan maka program akan otomatis dihentikan.

2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program:



3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut




