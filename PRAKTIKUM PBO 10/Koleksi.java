import java.util.ArrayList;
import java.util.List;

public class Koleksi<T> {
    private List<T> wadah;
    private int nbelm;

    public Koleksi(int capacity) {
        wadah = new ArrayList<>(capacity);
        nbelm = 0;
    }
    public T getIsi(int index) { return wadah.get(index); }
    public void setIsi(int index, T value) { wadah.set(index, value); }
    public int getSize() { return nbelm; }
    public void setSize(int size) { this.nbelm = size; }
    public void add(T value) {
        wadah.add(value);
        nbelm++;
    }
    public void delete(int index) {
        wadah.remove(index);
        nbelm--;
    }
    public void showAll() {
        for (T item : wadah) {
            System.out.println(item);
        }
    }
}
