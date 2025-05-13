public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi;
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = Math.hypot(alas/2, tinggi);
    }
    @Override
    public double luas() { return 0.5 * alas * tinggi; }
    @Override
    public double keliling() { return 2 * sisi + alas; }
}
