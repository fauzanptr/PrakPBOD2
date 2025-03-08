/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol.
 */

// Kelas Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        // Asersi untuk memastikan jari-jari tidak bernilai nol
        assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";

        // Membuat objek Lingkaran dan menghitung keliling
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

//Asersi seharusnya ditempatkan dalam konstruktor Lingkaran, bukan di dalam main(), agar memastikan tidak ada objek yang dibuat dengan nilai jariJari <= 0.
