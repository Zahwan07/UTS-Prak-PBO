//Interface
interface NilaiAkhir {
    double ipk(int[] nilaiMatkul);
}

//Abstract class
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

//Inheritance
class DataMahasiswa extends Mahasiswa {
    public DataMahasiswa(String nama, int[] nilaiMatkul) {
        super(nama, nilaiMatkul);
    }

//Polymorphism
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
