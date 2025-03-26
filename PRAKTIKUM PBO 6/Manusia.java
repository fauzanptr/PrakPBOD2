/* 
   Nama File    : Manusia.java
   Deskripsi    : Kelas dasar Manusia untuk pelaporan pajak tahunan
   Pembuat      : Muhammad Fauzan
   NIM          : 24060123120006
   Tanggal      : 20 Maret 2025
*/
public class Manusia {
    protected String nama;
    protected String tglMulaiKerja; // format "dd-MM-yyyy"
    protected String alamat;
    protected int pendapatan;

    private static int counterMns = 0;

    public Manusia(String nama, String tglMulaiKerja, String alamat, int pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Kerja  : " + tglMulaiKerja);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Pendapatan     : " + pendapatan);
    }

    // Mengambil tahun dari tglMulaiKerja (format dd-MM-yyyy)
    protected int getTahunMulai() {
        try {
            return Integer.parseInt(tglMulaiKerja.substring(tglMulaiKerja.lastIndexOf("-") + 1));
        } catch(Exception e) {
            return 0;
        }
    }
}

