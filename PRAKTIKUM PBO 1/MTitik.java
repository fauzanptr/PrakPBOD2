/* 
 * Nama File   : MTitik.java
 * Deskripsi   : Program utama untuk menjalankan class Titik
 * Pembuat     : Muhammad Fauzan Putra Adhitya / 24060123120006
 * Tanggal     : 19 Februari 2025
 */




public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik(-2, 5);

        T1.printTitik(); // Output: Titik (3.0, 4.0)
        T2.printTitik(); // Output: Titik (-2.0, 5.0)

        System.out.println("Kuadran T1: " + T1.getKuadran()); // Output: Kuadran T1: 1
        System.out.println("Jarak T1 dari pusat: " + T1.getJarakPusat()); // Output: Jarak T1 dari pusat: 5.0

        Titik T3 = T1.getRefleksiX();
        T3.printTitik(); // Output: Titik (3.0, -4.0)

        System.out.println("Jumlah titik yang dibuat: " + Titik.getCounterTitik()); // Output: Jumlah titik yang dibuat: 2
    }
}