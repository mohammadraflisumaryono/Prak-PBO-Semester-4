## BookStore Application

BookStore adalah sebuah aplikasi manajemen toko buku sederhana yang dirancang menggunakan bahasa pemrograman Java.
**Aplikasi Ini Di Rancang Untuk Memenuhi Ujian Tenngah Semester Mata Kuliah Programman Berbasi Objek Semester 4 Mohammad Rafli Sumaryono (1227050076) PBO IF-C 2022**
Aplikasi ini menyediakan berbagai fitur untuk membantu pemilik toko buku dalam mengelola inventaris dan penjualan buku mereka.

### Fitur Utama:

1. **Manajemen Inventaris:**
   - **List Books:** Menampilkan daftar buku yang tersedia beserta informasi detail seperti judul, penulis, harga, dan stok.
   - **Add Book:** Menambahkan buku baru ke dalam inventaris dengan memasukkan informasi seperti judul, penulis, harga, dan stok.
   - **Update Book:** Mengupdate informasi buku yang sudah ada, seperti penulis, harga, dan stok.
   - **Delete Book:** Menghapus buku dari inventaris.

2. **Penjualan Buku:**
   - **Sell Book:** Mengizinkan penjualan buku dari inventaris dengan memasukkan judul buku dan jumlah kopi yang dijual. Stok buku akan otomatis dikurangi setelah penjualan.

### Cara Menggunakan:

1. Jalankan program dengan menjalankan file `BookStore.java`.
2. Ikuti petunjuk yang ditampilkan untuk memilih berbagai operasi, seperti menampilkan daftar buku, menambahkan buku baru, mengupdate atau menghapus buku, dan menjual buku.
3. Ikuti instruksi yang ditampilkan di layar untuk memasukkan informasi yang diperlukan untuk setiap operasi.

### Konsep PBO yang Digunakan:

- **Encapsulation:** Atribut-atribut dalam kelas dienkapsulasi sebagai `private`, hanya dapat diakses melalui metode-metode publik.
- **Inheritance:** Kelas `ComicBook` mewarisi atribut dan metode dari kelas `Book`, dengan tambahan fitur spesifik hanya untuk komik.
- **Polymorphism:** Terjadi melalui overriding metode `displayInfo()` dalam kelas `ComicBook`, dan dalam penggunaan polimorfisme objek dalam kelas `BookStore`.
- **Interface atau Abstract:** Meskipun tidak digunakan secara langsung, konsep ini bisa dimasukkan untuk memperluas fungsionalitas di masa mendatang.

### Keunggulan Aplikasi:

- User-friendly interface dengan antarmuka yang sederhana dan mudah digunakan.
- Fitur lengkap untuk manajemen inventaris dan penjualan buku.
- Kemudahan pemeliharaan dan penambahan fitur-fitur baru di masa mendatang.

---
