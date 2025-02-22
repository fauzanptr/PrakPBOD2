/* 
 * Nama File   : Titik.java
 * Deskripsi   : Program utama class Titik
 * Pembuat     : Muhammad Fauzan Putra Adhitya / 24060123120006
 * Tanggal     : 19 Februari 2025
 */


public class Titik {
    // Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // Konstruktor
    public Titik() {
        this(0, 0);
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Method getter dan setter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Method untuk menggeser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Method untuk mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // Method untuk mendapatkan kuadran
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0; // Jika titik berada pada sumbu atau pusat
    }

    // Method untuk mendapatkan jarak dari pusat
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Method untuk mendapatkan jarak dari titik lain
    public double getJarak(Titik T) {
        double dx = this.absis - T.getAbsis();
        double dy = this.ordinat - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method untuk merefleksikan titik terhadap sumbu X
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Method untuk merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // Method untuk mendapatkan titik hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Method untuk mendapatkan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    // Method static untuk mendapatkan counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }
}