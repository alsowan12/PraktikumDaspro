Pertanyaan 2.1

1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!

Jawaban: Tidak harus 

Penjelasan: Karena tidak berpangaruh apun jika kita menghitung dari indeks 0 ataupun indeks 1 cuma perbedaannya adalah pada hasil output kolomnya jika indeks 0 maka itu dihitung kolom atau baris 1 dst.


2. Mengapa terdapat null pada daftar nama penonton?

Jawaban: Null muncul karena elemen array belum diberi nilai, sementara array sudah dicetak sepenuhnya



3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut

Jawaban: 

4. Tambahkan kode program sebagai berikut: Jelaskan fungsi dari penonton.length dan penonton[0].length! Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?

Jawaban: Sudah saya modifikasi

Penjelasan: Semua penonton[i].length sama karena array dibuat dengan ukuran kolom tetap [2]  


5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.

Jawaban: Dari pengamatan saya yaitu Perulangan for berjalan dari i = 0 sampai i < penonton.length (yaitu i = 0, 1, 2, 3) 


6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.


Jawaban: Dari pengamatan saya dari source code tersebut adalah cara lebih sederhana untuk menelusuri setiap baris dalam array 2 dimensi tanpa perlu meulis for (int i = 0; i < penonton.length; i++)


7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya


Jawaban: Code yang saya tambahkan pada code akan menampilkan indeks[2] pada baris ke 3 karena pada code yang saya tambahkan.

8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya.


Jawaban: output dari hasil modifikasi diatas adalah sama dengan pertanyaan 7 hanya beda dalam source codenya saja hanya untuk lebih simple saja.


9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.


Jawaban: Sudah Saya ubah dan menurut saya dari yang tadinya outputnya tidak bisa atau susah dikenali varibale dan kolomnya dengan diubah seperti tugas diatas akan mudah dikenali bari s dan kolomnnya.


10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?

Jawaban: Kelebihan foreach loop dibandingkan for loop lebih sederhana tidak perlu menulis inisialisasi,kondisi dan increment, dan kelebihan yang lainnya mungkin mudah dibaca dan dipahami.


Kekurangan foreach loop dibandingkan for loop tidak bisa mengakses indeks secara langsung dan tidak bisa memodifikasi isi array koleksi secara langsung. 


11. Berapa indeks baris maksimal untuk array penonton? 


Jawaban: 

Array penonton mempunyai [4] baris 

dan setiap baris punya [2] kolom atau kursi 


Jadi untuk maksimal array adalah 3



12. Berapa indeks kolom maksimal untuk array penonton?


Jawaban: 

indeks kolom maksimal untuk array penonton adalah 1 

Karena penonton[i].length = 2,

maka indeks maksimal kolomnya adalah 2 - 1 = 1.



13. Apa fungsi dari String.join()?

Jawaban: Fungsi dari sytax diatas adalah di java digunakan untuk menggabungkan beberapa elemen string menjadi satu string utuh, dengan pemisah tertentu dengan tiap elemen berbeda.



Pertanyaan 2.2


1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!

Jawaban: Tidak, pengisian elemen array tidak harus mulai dari -0 bisa disesuaikan sesuai keinginan saja.


2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:

- Menu 1: Input data penonton

- Menu 2: Tampilkan daftar penonton

- Menu 3: Exit



3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia


4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali


5. Pada menu 2, jika kursi kosong, ganti null dengan ****


Pertanyaan 2.3

1. Tambahkan kode program sebagai berikut


2. Apa fungsi dari Arrays.toString()?


Jawaban: Fungsi Arrays.toStrong() yaitu untuk mengubah seluruh isi array 1-D String yang sudah rapi


3. Apa nilai default untuk elemen pada array dengan tipe data int?


Jawaban: 0 sampai semua elemen otomatis terisi angka 0 sejak array dibuat.


4. Tambahkan kode program berikut


5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?


Jawaban: Tidak bisa, Setelah array dibuat ( new int[]) ukurannya tetap jika ingin dikurangi atau ditambah tetap tidak bisa harus membuat array baru lagi atau bisa memakai koleksi dinamis seperti Arraylist.


6. Gunakan scanner dan nested loop untuk mengisi elemen pada array nilai. Compile dan run kode program.


Pertanyaan 2.4 


1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.

Jawaban: Dari Hasil Modifikasi diatas saya mengerti bahwa array sangat membantu dalam pemilihan atau input sebuah data dala jumlah yang sangat relevan 


