/* 
 * Nama File   : MataKuliah.java
 * Deskripsi   : Program utama class Mata Kuliah
 * Pembuat     : Muhammad Fauzan Putra Adhitya / 24060123120006
 * Tanggal     : 26 Februari 2025
 */


public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor dan Mutator
    public String getIdMatKul() { 
        return idMatKul; 
    }

    public void setIdMatKul(String idMatKul) { 
        this.idMatKul = idMatKul; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public int getSks() { 
        return sks; 
    }
    
    public void setSks(int sks) { 
        this.sks = sks; 
    }
}
