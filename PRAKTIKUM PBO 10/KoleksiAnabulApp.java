import java.util.Random;

public class KoleksiAnabulApp {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAn = new Koleksi<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int r = rand.nextInt(3);
            switch (r) {
                case 0: koleksiAn.add(new Kucing("Kucing" + i)); break;
                case 1: koleksiAn.add(new Anjing("Anjing" + i)); break;
                case 2: koleksiAn.add(new Burung("Burung" + i)); break;
            }
        }
        System.out.println("===== Koleksi Anabul =====");
        for (int i = 0; i < koleksiAn.getSize(); i++) {
            Anabul a = koleksiAn.getIsi(i);
            System.out.println(a.getNama() + " -> Suara: " + a.suara() + ", Gerak: " + a.gerak());
        }
    }
}
