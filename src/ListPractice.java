import java.util.ArrayList;
public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("melon");
        fruits.add("watermelon");

        int listSize = fruits.size();
        String place = fruits.get(4);

        fruits.set(2, "green banana");

        fruits.remove(2);

        fruits.clear();

        System.out.println(fruits);
        System.out.println(place);

    }
}
