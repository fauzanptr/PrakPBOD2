/* 
   Nama File    : Petani.java
   Deskripsi    : Kelas Petani yang merupakan subclass dari Manusia
   Pembuat      : Muhammad Fauzan
   NIM          : 24060123120006
   Tanggal      : 20 Maret 2025
*/
import java.util.Calendar;
public class Petani extends Manusia {
    private String wilayah;
    private static int counterPetani = 0;

    public Petani(String nama, String tglMulaiKerja, String alamat, int pendapatan, String wilayah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.wilayah = wilayah;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public double hitungPajak() {
        return 0;
    }

    public int hitungMasaKerja() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int masa = currentYear - getTahunMulai();
        int C = 0; // Untuk Petani, nilai tambahan dianggap 0
        return masa + C;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Data Petani ===");
        super.cetakInfo();
        System.out.println("Wilayah        : " + wilayah);
        System.out.println("Pajak          : " + hitungPajak());
        System.out.println("Masa Kerja     : " + hitungMasaKerja());
        System.out.println();
    }
}
