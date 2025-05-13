import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("Anjing");
        animal.add("Kucing");
        animal.add("Farrel");

        for (String i : animal) {
            System.out.println(i);
        }
        System.out.println(" ");
        for (int index = 0; index < animal.size(); index++) {
            System.out.println(animal.get(index));
        }
    }
}