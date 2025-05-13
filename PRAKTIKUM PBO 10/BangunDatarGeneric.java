import java.util.ArrayList;
import java.util.List;

public class BangunDatarGeneric<T extends BangunDatar> {
    private List<T> list = new ArrayList<>();
    public void add(T bd) { list.add(bd); }
    public void showAll() {
        for (T bd : list) {
            System.out.println(bd.getNama() + " - Luas: " + bd.luas() + ", Keliling: " + bd.keliling());
        }
    }
}