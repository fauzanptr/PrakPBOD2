/* 
   Nama File    : PNS.java
   Deskripsi    : Kelas PNS yang merupakan subclass dari Manusia
   Pembuat      : Muhammad Fauzan
   NIM          : 24060123120006
   Tanggal      : 20 Maret 2025
*/
import java.util.Calendar;
public class PNS extends Manusia {
    private String nim;
    private static int counterPNS = 0;

    // Konstruktor dengan alamat
    public PNS(String nama, String tglMulaiKerja, String alamat, int pendapatan, String nim) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nim = nim;
        counterPNS++;
    }
    // Konstruktor tanpa alamat (akan di-set kemudian)
    public PNS(String nama, String tglMulaiKerja, int pendapatan, String nim) {
        super(nama, tglMulaiKerja, "", pendapatan);
        this.nim = nim;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public double hitungPajak() {
        return pendapatan * 0.10;
    }

    public int hitungMasaKerja() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int masa = currentYear - getTahunMulai();
        int A = 0;
        // Ambil digit ke-14 dari nim (1-indexed, sehingga index 13)
        if(nim.length() >= 14) {
            try {
                A = Character.getNumericValue(nim.charAt(13));
            } catch(Exception e) {
                A = 0;
            }
        }
        return masa + A;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Data PNS ===");
        super.cetakInfo();
        System.out.println("NIM            : " + nim);
        System.out.println("Pajak          : " + hitungPajak());
        System.out.println("Masa Kerja     : " + hitungMasaKerja());
        System.out.println();
    }
}
