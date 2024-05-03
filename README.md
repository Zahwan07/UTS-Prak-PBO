## UTS-Prak-PBO
Ujian Tengah Semester Mata Kuliah Praktikum Pemrograman Berorientasi Objek
---
- Mata Kuliah: Praktikum Pemrograman Berorientasi Objek
- Nama: Zulfan Al-Zahwan Putra Ashadi
- NIM: 1227050138
- Kelas: E
- Jurusan: Teknik Informatika
- Universitas: UIN Sunan Gunung Djati Bandung'
---

## Deskripsi Tugas:
Silahkan buat program yang didalamnya terdapat seluruh konsep PBO yang sudah dipelajari diantaranya terdapat :

* Encapsulation
* Inheritance
* Polimorphism
* Interface atau Abstract
Dibuat sesuai kriteria diatas dan minimal terdapat tiga class didalamnya.
---

## **Source Code**

```
// Interface
interface NilaiAkhir {
    double ipk(int[] nilaiMatkul);
}

// Abstract class
abstract class Mahasiswa implements NilaiAkhir {
    private String nama;
    private int[] nilaiMatkul;

    public Mahasiswa(String nama, int[] nilaiMatkul) {
        this.nama = nama;
        this.nilaiMatkul = nilaiMatkul;
    }

    public abstract double cariIpk();

    public double nilaiAkhir(int[] nilaiMatkul) {
        int sum = 0;
        for (int nilai : nilaiMatkul) {
            sum += nilai;
        }
        return (double) sum / nilaiMatkul.length;
    }

    public void displayMahasiswa() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("IPK: " + cariIpk());  //
    }

    protected int[] getNilaiMatkul() {
        return nilaiMatkul;
    }
}

class DataMahasiswa extends Mahasiswa {
    public DataMahasiswa(String nama, int[] nilaiMatkul) {
        super(nama, nilaiMatkul);
    }

    @Override
    public double ipk(int[] nilaiMatkul) {
        return nilaiAkhir(nilaiMatkul);
    
    }

    @Override
    public double cariIpk() {
        return ipk(getNilaiMatkul());
    }
}

public class UTSPrakPbo {
    public static void main(String[] args) {
        int[] nilaiMatkul = {4, 4, 3, 4, 3, 4, 4, 4, 3, 4};  
        Mahasiswa zahwan = new DataMahasiswa("Zahwan Ashadi", nilaiMatkul);
        zahwan.displayMahasiswa();
    }
}
```

## **Output**
![Output](https://github.com/Zahwan07/UTS-Prak-PBO/assets/118150521/969ae7ec-784b-4e64-86fd-4cbf48bb473f)


## Penjelasan Program

Program di atas adalah contoh implementasi konsep Object-Oriented Programming (OOP) dalam Java yang menggunakan konsep-konsep seperti Interface, Abstract Class, Inheritance, dan Polymorphism. Berikut adalah penjelasan singkat dari setiap komponen dan cara kerja program:

1. Interface NilaiAkhir:
* ```NilaiAkhir``` bertindak sebagai kontrak yang menentukan bahwa setiap kelas yang diimplementasikan oleh ```NilaiAkhir```  harus memiliki metode ```ipk``` yang menerima array nilai mata kuliah dan mengembalikan nilai IPK sebagai ```double```. jadi, Interface ini memastikan bahwa setiap ```mahasiswa``` memiliki kemampuan untuk menghitung IPK.


2. Abstract Class Mahasiswa:
* class ```Mahasiswa``` mengimplementasikan ```NilaiAkhir``` dan memberikan kerangka dasar untuk ```mahasiswa``` dengan menyimpan nama dan nilai mata kuliah.

* ```nama``` dan ```nilaiMatkul``` dijadikan variabel private, sehingga tidak dapat diakses secara langsung dari luar kelas ini, melainkan melalui metode yang didefinisikan.
  
* memiliki ```cariIpk``` yang Wajib diimplementasikan oleh kelas turunan, memungkinkan implementasi yang berbeda tergantung pada jenis mahasiswa.
  
* ```nilaiAkhir``` Menghitung rata-rata nilai mata kuliah yang diberikan.
  
* memiliki ``` displayMahasiswa```agar program Menampilkan informasi mahasiswa, termasuk IPK yang dihitung.
  

3.  Class DataMahasiswa:
* memiliki ```DataMahasiswa```agar ```Mahasiswa``` dapat diwarisi dan menyediakan implementasi untuk metode ```cariIpk```. ```DataMahasiswa``` juga Mewarisi properti dan metode dari kelas ```Mahasiswa```


4. Main Class UTSPrakPbo:
* Didalam method ```main```, program akan membuat objek ```zahwan``` dari kelas ```DataMahasiswa``` yang akan menginisialisasi objek ```nama``` dan array nilai dengan skala 4.00 sebagai IPK.

* objek ```zahwan``` terdefinisi sebagai tipe ```Mahasiswa``` tetapi diinisialisasikan sebagai ```DataMahasiswa``` agar objek berperilaku seperti kelas induknya yang menunjukkan konsep Polymorphism.


6. Output:
Program mencetak nama mahasiswa dan IPK yang dihitung dengan memanggil metode ```displayMahasiswa``` dari objek ```zahwan```.



