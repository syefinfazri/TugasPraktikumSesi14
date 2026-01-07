
# Tugas Praktikum Sesi 14 – Selection Sort

* **Nama**: Syefin Fazri Nugraha
* **NIM**: 20210040097
* **Kelas**: TI25F
* **Mata Kuliah**: Algoritma dan Struktur Data
* **Dosen Pengampu**: Shinta Ayuningtias, S.Kom., M.Kom

---

## Penjelasan Singkat

Praktikum ini bertujuan untuk memahami dan mengimplementasikan **algoritma Selection Sort**, baik untuk pengurutan data angka maupun data string, serta menganalisis jumlah perbandingan dan proses pertukaran (swap).

---

## Aktivitas 1 – Selection Sort Ascending

* **Data sebelum sorting**: 20, 18, 25, 34, 6
* **Data sesudah sorting**: 6, 18, 20, 25, 34
* **Kesimpulan**:
  Nilai `minIndex` tidak selalu berpindah di setiap iterasi. Perpindahan hanya terjadi jika ditemukan nilai yang lebih kecil dari elemen yang sedang dibandingkan.

---

## Aktivitas 2 – Selection Sort Descending

* **Data sebelum sorting**: 20, 18, 25, 34, 6
* **Data sesudah sorting**: 34, 25, 20, 18, 6
* **Perbedaan Ascending dan Descending**:

  * Ascending mencari **nilai terkecil** pada setiap iterasi
  * Descending mencari **nilai terbesar** pada setiap iterasi

---

## Aktivitas 3 – Analisis Kompleksitas

* **Total perbandingan**: 10
* **Total swap**: 3
* **Perbandingan dengan teori**:
  Rumus teori Selection Sort adalah
  [
  n(n-1)/2 = 5×4/2 = 10
  ]
  Hasil perhitungan sesuai dengan teori.

---

## Aktivitas 4 – Sorting Data String

* **Data sebelum sorting**: Budi, Andi, Cindy, Doni, Eka
* **Data sesudah sorting**: Andi, Budi, Cindy, Doni, Eka
* **Cara kerja Selection Sort pada String**:
  Perbandingan dilakukan menggunakan metode `compareTo()` atau `compareToIgnoreCase()` berdasarkan urutan alfabet (ASCII/Unicode).

---

## Mini Project Selection Sort

Mini project mengimplementasikan Selection Sort secara utuh dalam file:

* **File Java**: `MiniProjectSelectionSort.java`
* **Output Program**: `Output Mini Project Selection.png`

Program menampilkan proses sorting dan hasil akhir sesuai dengan konsep Selection Sort.

---

**Kesimpulan**
Selection Sort adalah algoritma sorting sederhana dengan kompleksitas waktu O(n²). Meskipun kurang efisien untuk data besar, algoritma ini mudah dipahami dan cocok untuk pembelajaran dasar algoritma sorting.

---
