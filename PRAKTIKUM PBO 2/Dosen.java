/* 
 * Nama File   : Dosen.java
 * Deskripsi   : Program utama class Dosen
 * Pembuat     : Muhammad Fauzan Putra Adhitya / 24060123120006
 * Tanggal     : 26 Februari 2025
 */



public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor dan Mutator
    public String getNip() { 
        return nip; 
    }

    public void setNip(String nip) { 
        this.nip = nip; 
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
}
