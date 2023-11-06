package javaprogrammes;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // create a hashmap with string keys and integer values
        Map<String, Integer> people = new HashMap<>();

        // add some key- value pairs to the hashmap
        people.put("Alice", 25);
        people.put("Bob", 30);
        people.put("Charlie", 22);
        people.put("David", 28);

        // use a for- each loop to iterate through the values in the map
        for (Integer age : people.values()) {
            System.out.println("Age:" + age);
        }
    }
}
