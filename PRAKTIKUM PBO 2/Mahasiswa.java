/* 
 * Nama File   : Mahasiswa.java
 * Deskripsi   : Program utama class Mahasiswa
 * Pembuat     : Muhammad Fauzan Putra Adhitya / 24060123120006
 * Tanggal     : 26 Februari 2025
 */


import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahMatKul;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.jumlahMatKul = 0;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.jumlahMatKul = 0;
    }

    // Selektor dan Mutator
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method untuk menambahkan mata kuliah
    public void addMatKul(MataKuliah mk) {
        listMatKul.add(mk);
        jumlahMatKul++;
    }

    // Method untuk mendapatkan total SKS
    public int getJumlahSKS() {
        int totalSks = 0;
        for (MataKuliah mk : listMatKul) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }

    // Mendapatkan jumlah mata kuliah
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    // Menampilkan data mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi);
    }

    // Menampilkan detail mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        
        for (MataKuliah mk : listMatKul) {
            System.out.println(mk.getNama());
        }
    }
}