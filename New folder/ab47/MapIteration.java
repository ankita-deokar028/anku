package ab47;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monday");
        map.put(2, "Tuesday");
        map.put(3, "Wednesday");
        map.put(4, "Thursday");
        map.put(5, "Friday");
  
        System.out.println("Iterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        System.out.println();

        System.out.println("Iterating using values():");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println();


        System.out.println("Iterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
