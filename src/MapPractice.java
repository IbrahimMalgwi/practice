import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Object, Object> cars = new HashMap<>();
        cars.put("BMW", 3);
        cars.put("Honda", 2);
        cars.put("Audi", 3);
        cars.put("Toyota", 5);
        cars.put("Mercedes", 8);
        cars.put("Mustang", 9);

        cars.remove("BMW");
        int mapSize = cars.size();

        System.out.println(cars);
        System.out.println(mapSize);
        System.out.println(cars.get("Toyota"));
    }
}
