import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> Animal = new HashMap<Integer, String>();
        Animal.put(1, "Anjing");
        Animal.put(2, "Kucing");
        Animal.put(3, "Farrel");
        Animal.put(4, "Ardana");
        Animal.put(5, "Jati");

        System.out.println(Animal.get(1));

        Set<Integer> key = Animal.keySet();
        System.out.println(key);

        for (Integer i : key) {
            System.out.println(Animal.get(i));
        }
    }

}