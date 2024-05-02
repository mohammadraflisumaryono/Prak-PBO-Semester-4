## BookStore Application

BookStore adalah sebuah aplikasi manajemen toko buku sederhana yang dirancang menggunakan bahasa pemrograman Java.
**Aplikasi Ini Di Rancang Untuk Memenuhi Ujian Tenngah Semester Mata Kuliah Programman Berbasi Objek Semester 4 Mohammad Rafli Sumaryono (1227050076) PBO IF-C 2022**
Aplikasi ini menyediakan berbagai fitur untuk membantu pemilik toko buku dalam mengelola inventaris dan penjualan buku mereka.

### Fitur Utama:
![image](https://github.com/mohammadraflisumaryono/Prak-PBO-Semester-4/assets/71733796/fd171553-2428-42fd-b63d-26bf595736e7)


1. **Manajemen Inventaris:**
   - **List Books:** Menampilkan daftar buku yang tersedia beserta informasi detail seperti judul, penulis, harga, dan stok.
     ![Screenshot 2024-05-02 191640](https://github.com/mohammadraflisumaryono/Prak-PBO-Semester-4/assets/71733796/a1f98adb-a578-4a9d-b440-8eb62b48b435)

   - **Add Book:** Menambahkan buku baru ke dalam inventaris dengan memasukkan informasi seperti judul, penulis, harga, dan stok.
     ![Screenshot 2024-05-02 191044](https://github.com/mohammadraflisumaryono/Prak-PBO-Semester-4/assets/71733796/59989fc5-e5c0-4c36-808a-bbd3ef6b32a5)

   - **Update Book:** Mengupdate informasi buku yang sudah ada, seperti penulis, harga, dan stok.
     ![Screenshot 2024-05-02 191849](https://github.com/mohammadraflisumaryono/Prak-PBO-Semester-4/assets/71733796/c9c69096-2265-4720-a1f1-97594c63e462)

   - **Delete Book:** Menghapus buku dari inventaris.
     ![Screenshot 2024-05-02 191947](https://github.com/mohammadraflisumaryono/Prak-PBO-Semester-4/assets/71733796/319c237a-2c05-42f7-bd90-d3211f922f5f)


2. **Penjualan Buku:**
   - **Sell Book:** Mengizinkan penjualan buku dari inventaris dengan memasukkan judul buku dan jumlah kopi yang dijual. Stok buku akan otomatis dikurangi setelah penjualan.
     ![Screenshot 2024-05-02 192014](https://github.com/mohammadraflisumaryono/Prak-PBO-Semester-4/assets/71733796/4f130dee-0562-4e4c-b23c-2a131e0eb1bd)


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
