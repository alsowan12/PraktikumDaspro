Jawaban Soal Jobsheet 

Jawaban Dari Pertanyaan 2.1

1. Apakah fungsi tanpa parameter selalu harus bertipe void?   

Jawaban : 
Tidak selalu . Fungsi tanpa parameter bisa memiliki tipe data pengembalian (return type) tertentu, seperti int, double, String, dll. Tipe void hanya digunakan ketika fungsi tidak mengembalikan nilai apapun.


2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!

Jawaban : 
Iya, daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu().


3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.

Jawaban :

Dalam konteks program kafe ini, jika kita tidak menggunakan fungsi Menu(), maka semua kode untuk menampilkan menu, memproses input, dan menampilkan total harga akan berada di main. Hal ini dapat membuat main menjadi panjang dan kurang terbaca, terutama jika program berkembang dan memiliki fitur tambahan.


Namun, untuk program yang sangat kecil, menulis langsung di main mungkin tidak menjadi masalah. Tapi untuk program yang lebih besar, penggunaan fungsi seperti Menu() akan sangat menguntungkan.



4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).


Jawaban : 

Mulai -> Input nama dan status member -> Panggil Menu -> Tampilkan salam dan menu -> Input pilihan menu dan jumlah -> Hitung total -> Tampilkan total. Penjelasan dari saya. 



Pertanyaan 2.2

1. Apakah kegunaan fungsi parameter di dalam fungsi?

Jawaban : 
Parameter di dalam fungsi digunakan untuk menerima data dari luar fungsi, sehingga fungsi dapat bekerja dengan data yang berbeda.

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?


Jawaban : Alasan menggunakan parameter di dalam fungsi yaitu : untuk mengirim informasi dan fungsi main ke fungsi menu()



3. Apakah parameter sama dengan variabel? Jelaskan!

Jawaban : Parameter dan variabel itu adalah dua konsep yang berbeda dalam pemrograman, Karena variabel dapat digunakan dimana saja dalam cakupannya, sedangkan parameter variabel yang dideklarasikan dalam tanda kurung pada definisi fungsi.


4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?

Jawaban : 
Parameter isMember digunakan untuk menentukan apakah pelanggan adalah member atau bukan.
Di dalam fungsi Menu, terdapat percabangan if yang memeriksa nilai isMember.
Jika isMember bernilai true, maka akan ditampilkan pesan bahwa pelanggan adalah member dan mendapatkan diskon 10%.
Selain itu, dalam perhitungan total harga, jika isMember true, maka akan diberikan diskon 10%.


Perbedaan jika bernilai true :

Akan muncul pesan: "Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!"

Total harga yang dibayar akan dikurangi 10%.


Jika Bernilai false :

pesan member tidak akan muncul.

Total harga dibayar tanpa diskon.


5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?

Jawaban : Yang terjadi adalah tidak bisa memanggil fungsi Menu() tanpa menyertakana parameter yang diperlukan karena java akan menimbulkan error kompilasi.


6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.


7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.


Jawaban : Pemanggilan Budi yang benar : Menu("Budi", true, "DISKON30", sc);



8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.


Jawaban : Parameter membuat fungsi menjadi modular, predictable, dan maintainable - tiga hal penting dalam pengembangan software yang baik.



Pertanyaan 2.3


1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus


Jawaban : 
Suatu fungsi membutuhkan nilai kembalian (return value) ketika fungsi tersebut bertugas untuk menghitung atau memproses data yang hasilnya akan digunakan lagi di bagian program lain. Sebaliknya, fungsi tidak perlu mengembalikan nilai ketika fungsi tersebut hanya bertugas untuk menjalankan suatu aksi (seperti menampilkan output ke layar) tanpa menghasilkan nilai yang akan digunakan selanjutnya.


2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.


jawaban : 

Tipe data nilai kembalian: int (fungsi mengembalikan total harga sebagai integer)

Dua parameter:

int pilihanMenu: Parameter pertama, merupakan nomor menu yang dipilih oleh pelanggan (misalnya 1 untuk Kopi Hitam, 2 untuk Cappuccino, dst.)

int banyakItem: Parameter kedua, merupakan jumlah item yang dibeli untuk menu yang dipilih.


3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.



4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?


Pertanyaan 2.4

1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!


Jawaban : penggunaan String... namaPengunjung dipilih karena memberikan fleksibilitas maksimal dalam menangani daftar pengunjung yang jumlahnya tidak tetap!


2. Modifikasi method daftarPengunjung menggunakan for-each loop


3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!

Jawaban : 

Tidak bisa, dalam Java tidak boleh menggunakan dua parameter varaargs dalam satu fungsi. Aturan varaargs di Java hanya memperbolehkan satu parameter varaargs per metode, dan parameter varaargs harus berada di posisi terakhir dalam daftar parameter.

Alasannya adalah karena varaargs dirancang untuk menangani sejumlah argumen yang tidak tentu, dan jika ada dua varaargs, compiler tidak akan dapat menentukan di mana batas antara argumen untuk varaargs pertama dan varaargs kedua.


4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?


Jawaban :

Program tidak akan error, baik saat kompilasi maupun saat dijalankan, karena varargs memang diperbolehkan tanpa argumen.

Output yang dihasilkan: karena array kosong, maka loop for-each tidak akan mengeksekusi body-nya, sehingga hanya mencetak string awal


Pertanyaan 2.5

1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!


Jawaban : 

    1. Program dimulai dari metode main.

    2. Deklarasi variabel: p, l, t, L, vol.

    3. Membuat objek Scanner untuk input dari keyboard.

    4. Menampilkan "Masukkan Panjang : " kemudian membaca integer dan menyimpannya di variabel p.

    5. Menampilkan "Masukkan Lebar : " kemudian membaca integer dan menyimpannya di variabel l.

    6. Menampilkan "Masukkan Tinggi : " kemudian membaca integer dan menyimpannya di variabel t.

    7. Menghitung luas persegi panjang dengan rumus p * l dan menyimpannya di variabel L.

    8. Menampilkan luas persegi panjang.

    9. Menghitung volume balok dengan rumus p * l * t dan menyimpannya di variabel vol.

    10. Menampilkan volume balok.

    11. Menutup scanner.


2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.


Jawaban :


3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!


4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!


Jawaban : 


5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.


Jawaban :


6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume


Jawaban : 