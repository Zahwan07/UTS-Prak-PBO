# UTS-Prak-PBO
Ujian Tengah Semester Mata Kuliah Praktikum Pemrograman Berorientasi Objek

Mata Kuliah: Praktikum Pemrograman Berorientasi Objek
Nama: Zulfan Al-Zahwan Putra Ashadi
NIM: 1227050138
Kelas: E
Jurusan: Teknik Informatika
Universitas: UIN Sunan Gunung Djati Bandung'


## Deskripsi Tugas:
Silahkan buat program yang didalamnya terdapat seluruh konsep PBO yang sudah dipelajari diantaranya terdapat :

Encapsulation
Inheritance
Polimorphism
Interface atau Abstract
Dibuat sesuai kriteria diatas dan minimal terdapat tiga class didalamnya.


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
