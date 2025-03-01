/* 
 * Nama File   : MMhasiswa.java
 * Deskripsi   : Program utama untuk menjalankan class Mahasiswa
 * Pembuat     : Muhammad Fauzan Putra Adhitya / 24060123120006
 * Tanggal     : 26 Februari 2025
 */



import java.util.ArrayList;

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();
        
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
