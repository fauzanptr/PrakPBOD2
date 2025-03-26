/* 
   Nama File    : Pengusaha.java
   Deskripsi    : Kelas Pengusaha yang merupakan subclass dari Manusia
   Pembuat      : Muhammad Fauzan
   NIM          : 24060123120006
   Tanggal      : 20 Maret 2025
*/
import java.util.Calendar;
public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tglMulaiKerja, String alamat, int pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public double hitungPajak() {
        return pendapatan * 0.15;
    }

    public int hitungMasaKerja() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int masa = currentYear - getTahunMulai();
        int B = 0;
        // Hilangkan karakter non-digit dari npwp
        String digits = npwp.replaceAll("\\D", "");
        if(digits.length() >= 13) {
            try {
                B = Character.getNumericValue(digits.charAt(12));
            } catch(Exception e) {
                B = 0;
            }
        }
        return masa + B;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Data Pengusaha ===");
        super.cetakInfo();
        System.out.println("NPWP           : " + npwp);
        System.out.println("Pajak          : " + hitungPajak());
        System.out.println("Masa Kerja     : " + hitungMasaKerja());
        System.out.println();
    }
}
