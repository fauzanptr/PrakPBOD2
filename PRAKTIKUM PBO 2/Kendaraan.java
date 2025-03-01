/* 
 * Nama File   : Kendaraan.java
 * Deskripsi   : Program utama class Kendaraan
 * Pembuat     : Muhammad Fauzan Putra Adhitya / 24060123120006
 * Tanggal     : 26 Februari 2025
 */


public class Kendaraan {
    private String noPlat;
    private String jenis;

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor dan Mutator
    public String getNoPlat() { 
        return noPlat; 
    }
    
    public void setNoPlat(String noPlat) { 
        this.noPlat = noPlat; 
    }

    public String getJenis() { 
        return jenis; 
    }

    public void setJenis(String jenis) { 
        this.jenis = jenis; 
    }
}
