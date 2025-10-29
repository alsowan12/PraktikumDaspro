Pertanyaan 2.1

1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?

Jawaban: Jika inisialisasi i=1 diubah menjadi i=0 maka output bintang yang ditampilkan akan bertambah satu contoh "jika nilai N yang dimasukkan 5 maka akan bertambah 1 menjadi 6 bintang,


Penjelasan: Hitungan perulangan dimulai dari 0 jadi jika nilai N=5 akan dihitung 0.1.2.3.4.5 begitu jugaa sebaliknya jika i=1 maka nilai N=5 akan dihitung 1,2,3,4,5


2. Jika pada perulangan for, kondisi i<=n diubah menjadi i<n, bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda?

Jawaban: Bentuk output dari n = 5 yaitu hasil bintangnya dikurangi 1 menjadi 4 bintang 


Penjelasan: Kondisi sekarang berarti perulangan berhenti sebelum nilai N. jika user meminta N = 5 perulangan hanya berjalan i = 1,2,3,4. 


3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?

Jawaban: Maka output yang dihasilkan jika kondisi tersebut diubah seperti pertanyaan diatas program akan tidak berjalan sama sekali.

Penjelasan: Nilali i adalah 1 kondisi yang diminta adalah i harus lebih besar dari N karena 1 selalu lebih kecil dari N kondisinya langsung salah sejak awal sehingga program melompati seluruh proses percetakan.


4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?

Jawaban: Jika perulangan for kondisi step i++ diubah menjadi i-- akibatnya output program akan infinite loop.

Penjelasan: Perulangan umumnya adalah for (int i=1; i<=n; i++) dan diubah menjadi for (int i=1; i<=n; i--) maka akan tak terbatas infinite loop.


5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?

Jawaban: Pola Output jika n=6 Perulangan menjadi for (int i=1; i<=6; i+=2). Outputnya adalah tiga bintang (***).

Penjelasan: Perubahan tersebut disebabkan oleh step i += 2 yang merupakan singkatan dari i=i+2. Ini berarti nilai variabel loop i bertambah 2 pada setiap iterasi, bukan 1. Dengan n=6 dan i dimulai dari 1, hanya nilai i ganjil (1, 3, 5) yang akan memenuhi kondisi i <= 6 dan dieksekusi sebelum nilai berikutnya (7) melampaui n, sehingga jumlah perulangan menjadi setengahnya.



Pertanyaan 2.2

1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?

Jawaban: Akibatnya pada output yaitu output yang awalnya bintang dengan 5 baris bintang akan menjadi 6 baris bintang 

Penjelasan: Perulangan yang diluar adalah untuk mengatur baris pada program inisialisasi iOuter=1 membuat perulangan berjalan untuk iOuter1,2,3 dst.


2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?

Jawaban: Akibatnya output bintang yang dihasilkan menjadi 5 baris bintang yang dimana setiap baris berisi 6 bintang 

Penjelasan: Karena inisialisasi i=1 itu menghitung mulai dari 1,2,3,4,5 dst, sedangkan jika inisialisasi i=0 maka akan dihitung mulai dari 0,1,2 dst. Jadi jika inisialisasi diubah maka hitungan hasil awal akan berubah sesuai dengan pada program.


3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?

Jawaban: Bagian perulangan luar jika pada dalam code ini adalah digunakan sebagai memproses untuk output pada baris bintang dan kalau perulangan yang berada diluar sebagai memproses ouput untuk setiap barisnya  


4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?

Jawaban: Akibatnya jika dihilangkan maka output yang dihasilkan akan berupa bintang dengan satu baris saja tanpa adanya baris dibawahnya lagi.

Penjelasan: Karena sintkas Sytem.out.println(); berguna untuk kita sebagai user untuk membuat sebuah output yang berbaris kebawah atau bisa kita kelompok an sesuai dengan keinginan kita sebagai user atau pengguna program tersebut. 


5. Silakan commit dan push ke repository Anda



Pertanyaan 2.3

1. Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut?

Jawaban: Belum sesuai dengan gambar diatas.


2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.

Jawaban: Jadi yang saya tambahkan adalah sintaks System.out.println(), Karena untuk membuat new line pada output program saya yang sebelumnya belum ada linenya.


3. Silakan commit dan push ke repository Anda.


4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?

Jawaban: (Peran Loop Luar)Peran i adalah sebagai penghitung baris atau nomer baris, (Peran Loop Dalam) sebagai penghitung bintang di baris pada program ini. Kenapa j harus direset dari 0
karena agar bisa menghitung baris baru dari awal.



Pertanyaan 2.4 

1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar.

Jawaban: Penjelasan setiap Outer loop Outer loop → while (i <= 6) → mewakili setiap kelompok (ada 6 kelompok)


Inner loop → for (int j = 1; j <= 5; j++) → mewakili 5 penilai yang memberi nilai pada setiap kelompok


Penjelasan: Mengapa totalnilai=0 harus diletakkan di outer loop karena untuk menghitng total baru di setiap kelompok.

2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut

Jawaban: 



