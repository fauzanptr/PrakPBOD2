public class Persegi extends BangunDatar {
    private double sisi;
    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }
    @Override
    public double luas() { return sisi * sisi; }
    @Override
    public double keliling() { return 4 * sisi; }
}