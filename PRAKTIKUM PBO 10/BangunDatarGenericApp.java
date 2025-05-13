public class BangunDatarGenericApp {
    public static void main(String[] args) {
        BangunDatarGeneric<BangunDatar> app = new BangunDatarGeneric<>();
        app.add(new Persegi(5));
        app.add(new Persegipanjang(4, 6));
        app.add(new Segitiga(4, 3));
        System.out.println("===== Hasil Pengujian Bangun Datar Generic =====");
        app.showAll();
    }
}