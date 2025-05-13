public class MainKarakter {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKar = new Koleksi<>(10);
        for (char c = 'A'; c <= 'J'; c++) koleksiKar.add(c);
        System.out.println("===== Koleksi Karakter =====");
        koleksiKar.showAll();
    }
}
