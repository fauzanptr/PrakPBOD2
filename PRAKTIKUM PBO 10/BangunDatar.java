public abstract class BangunDatar {
    protected String nama;
    public BangunDatar(String nama) {
        this.nama = nama;
    }
    public String getNama() { return nama; }
    public abstract double luas();
    public abstract double keliling();
}